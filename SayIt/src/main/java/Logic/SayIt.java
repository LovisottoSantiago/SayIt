package Logic;

import Gui.HomePage;
import Gui.PhrasePage;
import Gui.TestScreen;

public class SayIt {

    public static void main(String[] args) {        
        System.out.println("Hello World!");
        startHomeScreen();                     
    }
    
     // <! ------------------------------------ METHODS ------------------------------------ !/>      
    // <! ------------ Start test screen  ------------ !/>    
    public static void startTestScreen(){
        TestScreen testPage = new TestScreen();
        testPage.setVisible(true);
        testPage.setLocationRelativeTo(null);
    }
    
        // <! ------------ Start home screen  ------------ !/>    
    public static void startHomeScreen(){
        HomePage homePage = new HomePage();
        homePage.setVisible(true);
        homePage.setLocationRelativeTo(null);
    }
}