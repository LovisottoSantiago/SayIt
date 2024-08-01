package Logic;

import edu.cmu.sphinx.api.Configuration;
import edu.cmu.sphinx.api.LiveSpeechRecognizer;
import edu.cmu.sphinx.api.SpeechResult;
import java.io.IOException;

public final class Voice {
    public LiveSpeechRecognizer speechRecognizer;
    public Voice() {
        initializeRecognizer();
    }

    public void initializeRecognizer() {
        Configuration config = new Configuration();
        config.setAcousticModelPath("resource:/edu/cmu/sphinx/models/en-us/en-us");
        config.setDictionaryPath("src/main/resources/Dictionary/0924.dic");
        config.setLanguageModelPath("src/main/resources/Dictionary/0924.lm");

        try {
            speechRecognizer = new LiveSpeechRecognizer(config);
        } catch (IOException e) {
        }
    }

    public String recognizeSpeech() {
        String voiceCommand = "";
        speechRecognizer.startRecognition(true);
        SpeechResult speechResult = speechRecognizer.getResult();
         if (speechResult != null) {
            voiceCommand = speechResult.getHypothesis();
         }    
        speechRecognizer.stopRecognition();
        return voiceCommand;
    }
    
    
    
}
