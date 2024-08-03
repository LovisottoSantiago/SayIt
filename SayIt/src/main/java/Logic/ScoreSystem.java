package Logic;

import org.apache.commons.text.similarity.LevenshteinDistance;

public class ScoreSystem {

    private static final int THRESHOLD = 3; // Adjust this value as needed

    public ScoreSystem() {
        System.out.println("Score system loaded");
    }
    
    public boolean returnResult(String sentenceText, String sentenceInput) {
        LevenshteinDistance distance = new LevenshteinDistance();
        int editDistance = distance.apply(sentenceText.toLowerCase(), sentenceInput.toLowerCase());
        
        // Check if the edit distance is within the acceptable threshold
        return editDistance <= THRESHOLD;
    }
}
