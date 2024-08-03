package Logic;

import com.sun.speech.freetts.Voice;
import com.sun.speech.freetts.VoiceManager;

public class TextTTS {

    private final Voice voice;

    public TextTTS() { 
        System.setProperty("freetts.voices", "com.sun.speech.freetts.en.us.cmu_us_kal.KevinVoiceDirectory");
        VoiceManager voiceManager = VoiceManager.getInstance();
        voice = voiceManager.getVoice("kevin16");
        
        if (voice != null) {
            try {
                voice.allocate();
                voice.setPitch(120); // Adjust pitch as needed
                voice.setRate(150); // Adjust rate as needed
                System.out.println("Text-to-Speech engine ready...");
            } catch (Exception e) {
                System.err.println("Failed to allocate voice: " + e.getMessage());
            }
        } else {
            System.err.println("Voice not found.");
        }
    }

    public void Talk(final String phrase) {
        if (voice != null && phrase != null && !phrase.isEmpty()) {
            new Thread(() -> voice.speak(phrase)).start(); // Use a new thread to avoid blocking
        } else {
            System.err.println("Voice is not initialized or phrase is empty.");
        }
    } 
}
