package Logic;

import com.sun.speech.freetts.Voice;
import com.sun.speech.freetts.VoiceManager;

public class TextTTS {

    private final Voice speaker;

    public TextTTS() { 
        System.setProperty("freetts.voices", "com.sun.speech.freetts.en.us.cmu_us_kal.KevinVoiceDirectory");
        VoiceManager voiceManager = VoiceManager.getInstance();
        speaker = voiceManager.getVoice("kevin16");
        
        if (speaker != null) {
            try {
                speaker.allocate();
                speaker.setPitch(120); // Adjust pitch as needed
                speaker.setRate(140); // Adjust rate as needed
                System.out.println("Text-to-Speech engine ready...");
            } catch (Exception e) {
                System.err.println("Failed to allocate voice: " + e.getMessage());
            }
        } else {
            System.err.println("Voice not found.");
        }
    }

    public void Talk(final String phrase) {
        if (speaker != null && phrase != null && !phrase.isEmpty()) {
            new Thread(() -> speaker.speak(phrase)).start(); // Use a new thread to avoid blocking
        } else {
            System.err.println("Voice is not initialized or phrase is empty.");
        }
    } 
    
    public void stop() {
        if (speaker != null) {
            try {
                speaker.deallocate(); // Release resources
                System.out.println("Voice deallocated.");
            } catch (Exception e) {
                System.err.println("Failed to deallocate voice: " + e.getMessage());
            }
        }
    }
    
    
}
