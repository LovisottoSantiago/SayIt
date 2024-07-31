package Logic;

import edu.cmu.sphinx.api.Configuration;
import edu.cmu.sphinx.api.LiveSpeechRecognizer;
import edu.cmu.sphinx.api.SpeechResult;
import java.io.IOException;

public class VoiceRecognizer {
        private LiveSpeechRecognizer recognizer;

    public VoiceRecognizer() {
        try {
            Configuration config = new Configuration();
            // Update these paths as necessary
            config.setAcousticModelPath("resource:/edu/cmu/sphinx/models/en-us/en-us");
            config.setDictionaryPath("resource:/edu/cmu/sphinx/models/en-us/cmudict-en-us.dict");
            config.setLanguageModelPath("resource:/edu/cmu/sphinx/models/en-us/en-us.lm.bin");
            
            recognizer = new LiveSpeechRecognizer(config);
            System.out.println("Recognizer initialized.");
        } catch (IOException e) {
            System.err.println("Error initializing recognizer: " + e.getMessage());
        }
    }

    public void startRecognition() {
        if (recognizer == null) {
            System.err.println("Recognizer is not initialized.");
            return;
        }

        try {
            System.out.println("Starting voice recognition...");
            recognizer.startRecognition(true);

            SpeechResult result;
            while ((result = recognizer.getResult()) != null) {
                System.out.println("You said: " + result.getHypothesis());
            }
        } catch (Exception e) {
            System.err.println("Error during recognition: " + e.getMessage());
        } finally {
            recognizer.stopRecognition();
            System.out.println("Recognition stopped.");
        }
    }
}
