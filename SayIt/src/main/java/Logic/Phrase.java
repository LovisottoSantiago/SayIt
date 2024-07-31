package Logic;
import java.util.Random;
import java.util.ArrayList;


public class Phrase {

    private ArrayList<String> sentenceStarters;
    private ArrayList<String> sentenceFinishers;

    public Phrase(ArrayList<String> sentenceStarters, ArrayList<String> sentenceFinishers) {
        this.sentenceStarters = sentenceStarters;
        this.sentenceFinishers = sentenceFinishers;
    }

    public ArrayList<String> getSentenceStarters() {
        return sentenceStarters;
    }
    public void setSentenceStarters(ArrayList<String> sentenceStarters) {
        this.sentenceStarters = sentenceStarters;
    }

    public ArrayList<String> getSentenceFinishers() {
        return sentenceFinishers;
    }
    public void setSentenceFinishers(ArrayList<String> sentenceFinishers) {
        this.sentenceFinishers = sentenceFinishers;
    }
    

 // <! ------------------------------------ METHODS ------------------------------------ !/>   
// <! ------------ Generate a random phrase ------------ !/>   
        public String randomPhrase(){
        String start = randomStarter();
        String finish = randomFinisher();
        String output = start + " " + finish;
        return output;        
    }   
        
    // <! ------------ Generate a random starter ------------ !/>
    public String randomStarter(){
        Random choice = new Random();
        int randomWord = choice.nextInt(sentenceStarters.size());              
        String output = sentenceStarters.get(randomWord);                    
        return output;
    }
    
    // <! ------------ Generate a random finisher ------------ !/>
    public String randomFinisher(){
        Random choice = new Random();
        int randomWord = choice.nextInt(sentenceFinishers.size());              
        String output = sentenceFinishers.get(randomWord);                    
        return output;
    }
    
    
    
    
    
    
}
