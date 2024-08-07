package Logic;

import java.util.Random;
import java.util.ArrayList;

public class Phrase {

    private ArrayList<String> sentence;
    private final ArrayList<Integer> usedIndices; // To store indices of previously chosen phrases
    private final Random choice;

    public Phrase(ArrayList<String> sentence) {
        this.sentence = sentence;
        this.usedIndices = new ArrayList<>();
        this.choice = new Random();
    }

    public ArrayList<String> getSentence() {
        return sentence;
    }

    public void setSentence(ArrayList<String> sentence) {
        this.sentence = sentence;
    }

    // Generate a random sentence without repetition
    public String randomSentence() {
        if (sentence.isEmpty()) {
            return null; // No phrases available
        }

        if (usedIndices.size() >= sentence.size()) {
            // All phrases have been used; reset the usedIndices list
            usedIndices.clear();
        }

        int randomWord;
        do {
            randomWord = choice.nextInt(sentence.size());
        } while (usedIndices.contains(randomWord));

        usedIndices.add(randomWord);
        return sentence.get(randomWord);
    }
}
