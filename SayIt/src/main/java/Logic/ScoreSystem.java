package Logic;

import org.apache.commons.text.similarity.LevenshteinDistance;

public class ScoreSystem {

    private final int threshold;

    public ScoreSystem(int threshold) {
        this.threshold = threshold;
        System.out.println("Score system loaded with threshold: " + threshold);
    }
    
    public boolean returnResult(String sentenceText, String sentenceInput) {
        LevenshteinDistance distance = new LevenshteinDistance();
        int editDistance = distance.apply(sentenceText.toLowerCase(), sentenceInput.toLowerCase());
        
        // Check if the edit distance is within the acceptable threshold
        return editDistance <= threshold;
    }
}
