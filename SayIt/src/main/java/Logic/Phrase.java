package Logic;
import java.util.Random;
import java.util.ArrayList;


public class Phrase {

    private ArrayList<String> sentence;

    public Phrase(ArrayList<String> sentence) {
        this.sentence = sentence;
    }

    public ArrayList<String> getSentence() {
        return sentence;
    }
    public void setSentence(ArrayList<String> sentence) {
        this.sentence = sentence;
    }

// <! ------------------------------------ METHODS ------------------------------------ !/>   
        
    // <! ------------ Generate a random sentence ------------ !/>
    public String randomSentence(){
        Random choice = new Random();
        int randomWord = choice.nextInt(sentence.size());              
        String output = sentence.get(randomWord);                    
        return output;
    }    
    
}
