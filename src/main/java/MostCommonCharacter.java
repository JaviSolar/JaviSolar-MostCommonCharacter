import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class MostCommonCharacter {
    /**
     * Find the most common character in str.
     * You could use a HashMap that maps a Character key to an Int value to represent how many times a Character has
     * been spotted.
     * @param str A String.
     * @return the most common character within str.
     */
    public char recurringChar(String str) {
        HashMap<Character, Integer> commonCharMap = new HashMap<>();
        char mostFreqChar = ' ';
        int largestCharOccurence = 0;

        for (int i = 0; i < str.length(); i++) {
            if (commonCharMap.containsKey(str.charAt(i))) {
                commonCharMap.put(str.charAt(i), commonCharMap.get(str.charAt(i)) + 1);
            } else {
                commonCharMap.put(str.charAt(i), 1);
            }
        }
        
        for (Map.Entry<Character, Integer> entry : commonCharMap.entrySet()) {
            int currCharVal = entry.getValue();

            if (currCharVal > largestCharOccurence) {
                largestCharOccurence = currCharVal;
                mostFreqChar = entry.getKey();
            }
        }

        return mostFreqChar;
    }
}
