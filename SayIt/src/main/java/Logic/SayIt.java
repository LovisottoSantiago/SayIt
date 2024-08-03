package Logic;

import Gui.PhrasePage;
import Gui.TestScreen;

public class SayIt {

    public static void main(String[] args) {        
        System.out.println("Hello World!");
        
        //startPhraseScreen();
        //startTestScreen();
        
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