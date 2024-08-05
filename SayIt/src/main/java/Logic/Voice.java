package Logic;

import edu.cmu.sphinx.api.Configuration;
import edu.cmu.sphinx.api.LiveSpeechRecognizer;
import edu.cmu.sphinx.api.SpeechResult;
import java.io.IOException;

public final class Voice {
    private static LiveSpeechRecognizer speechRecognizer = null;
    private static boolean isRecognizing = false;
    private static boolean isDisposed = false;

    public Voice() {
        initializeRecognizer();
        System.out.println("Voice recognition system initialized...");
    }

    private synchronized void initializeRecognizer() {
        if (speechRecognizer != null && isDisposed) {
            deallocate(); // Clean up any existing resources
        }

        Configuration config = new Configuration();
        config.setAcousticModelPath("resource:/edu/cmu/sphinx/models/en-us/en-us");
        config.setDictionaryPath("src/main/resources/Dictionary/0924.dic");
        config.setLanguageModelPath("src/main/resources/Dictionary/0924.lm");

        try {
            speechRecognizer = new LiveSpeechRecognizer(config);
            isDisposed = false;
        } catch (IOException e) {
            System.err.println("Error initializing recognizer: " + e.getMessage());
        }
    }

    public synchronized String recognizeSpeech() {
        if (isDisposed) {
            return ""; // Return an empty string if the instance is disposed
        }

        String voiceCommand = "";
        if (speechRecognizer != null) {
            try {
                isRecognizing = true;
                speechRecognizer.startRecognition(true);
                SpeechResult speechResult = speechRecognizer.getResult();
                if (speechResult != null) {
                    voiceCommand = speechResult.getHypothesis();
                }
            } catch (Exception e) {
                System.err.println("Error during speech recognition: " + e.getMessage());
            } finally {
                stop(); // Ensure recognition is stopped
            }
        }
        return voiceCommand;
    }

    public synchronized void stop() {
        if (speechRecognizer != null && isRecognizing) {
            try {
                speechRecognizer.stopRecognition();
                isRecognizing = false;
                System.out.println("Speech recognizer stopped.");
            } catch (Exception e) {
                System.err.println("Error stopping speech recognizer: " + e.getMessage());
            }
        }
    }

    public synchronized void deallocate() {
        if (isDisposed) {
            return; // Do nothing if already disposed
        }
        stop(); // Ensure it's stopped before deallocating
        speechRecognizer = null;
        isDisposed = true; // Mark as disposed
        System.out.println("Speech recognizer deallocated.");
    }
}
