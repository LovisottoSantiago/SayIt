package Logic;

import Gui.PhrasePage;

public class SayIt {

    public static void main(String[] args) {        
        System.out.println("Hello World!");
        
        startPhraseScreen();
        
       
        //VoiceRecognizer voice = new VoiceRecognizer();
        
        //voice.startRecognition();
        
    }
    
     // <! ------------------------------------ METHODS ------------------------------------ !/>   
    // <! ------------ Start phrase screen  ------------ !/>       
    public static void startPhraseScreen(){
        PhrasePage phrasePage = new PhrasePage();
        phrasePage.setVisible(true);
        phrasePage.setLocationRelativeTo(null);
    }
    
}
