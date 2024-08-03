package Logic;

import Gui.PhrasePage;
import Gui.TestScreen;

public class SayIt {

    public static void main(String[] args) {        
        System.out.println("Hello World!");
        
        startPhraseScreen();
        //startTestScreen();
        
        
        
        /* Testing
        Voice voice = new Voice();
        String rta = voice.recognizeSpeech();
        String aaa = "BUT THERE IS A LIMIT";
        
        ScoreSystem score = new ScoreSystem();
        boolean omg = score.returnResult(aaa, rta);
        
        System.out.println(omg);
        */
    }
    
     // <! ------------------------------------ METHODS ------------------------------------ !/>   
    // <! ------------ Start phrase screen  ------------ !/>       
    public static void startPhraseScreen(){
        PhrasePage phrasePage = new PhrasePage();
        phrasePage.setVisible(true);
        phrasePage.setLocationRelativeTo(null);
    }
    
    // <! ------------ Start test screen  ------------ !/>    
    public static void startTestScreen(){
        TestScreen testPage = new TestScreen();
        testPage.setVisible(true);
        testPage.setLocationRelativeTo(null);
    }
}