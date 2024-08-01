package Logic;

import java.io.IOException;
import edu.cmu.sphinx.api.Configuration;
import edu.cmu.sphinx.api.LiveSpeechRecognizer;
import edu.cmu.sphinx.api.SpeechResult;

public final class Voice {

    private LiveSpeechRecognizer speechRecognizer;

    public Voice() {
        initializeRecognizer();
    }

    private void initializeRecognizer() {
        Configuration config = new Configuration();
        config.setAcousticModelPath("resource:/edu/cmu/sphinx/models/en-us/en-us");
        config.setDictionaryPath("src/main/resources/Dictionary/0924.dic");
        config.setLanguageModelPath("src/main/resources/Dictionary/0924.lm");

        try {
            speechRecognizer = new LiveSpeechRecognizer(config);
            speechRecognizer.startRecognition(true);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void recognizeSpeech() {
        if (speechRecognizer == null) {
            System.err.println("Speech recognizer is not initialized.");
            return;
        }

        SpeechResult speechResult;
        try {
            while ((speechResult = speechRecognizer.getResult()) != null) {
                String voiceCommand = speechResult.getHypothesis();
                System.out.println("You said: " + voiceCommand);
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            stopRecognition();
        }
    }

    private void stopRecognition() {
        if (speechRecognizer != null) {
            speechRecognizer.stopRecognition();
            speechRecognizer = null;
        }
    }
}
