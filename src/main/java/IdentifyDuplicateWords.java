import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

public class IdentifyDuplicateWords {

    public static void main(String args[]) {
        String sentence = "JAVA is important for all SDET and all JAVA became mandate";
        String[] splitWords = sentence.split(" ");
        int lengthOfSplitWords = splitWords.length;

        for (int i = 0; i < lengthOfSplitWords; i++) {
            int counter = 0;
            for (int j = 0; j < lengthOfSplitWords; j++) {
                if (splitWords[i].equals(splitWords[j])) {
                    counter++;
                }
            }
            if (counter > 1) {
                System.out.println("The repeated words using for loop --> " + splitWords[i] + " : with " + counter + " times");
            }
        }

        System.out.println("----------------------------------");

        HashMap<String, Integer> stringMap = new HashMap<>();
        for (String word : splitWords) {
            if (stringMap.containsKey(word)) {
                stringMap.put(word, stringMap.get(word) + 1);
            } else {
                stringMap.put(word, 1);
            }
        }
        System.out.println("The repeated word using HashMap --> " + stringMap);
        System.out.println("----------------------------------");

        List<String> listOfWord = Arrays.asList(splitWords);
        for (String word : listOfWord) {
            if(Collections.frequency(listOfWord, word) > 1) {
                System.out.println("The repeated word using Collections Frequency --> " + word);
            }
        }
    }

}
