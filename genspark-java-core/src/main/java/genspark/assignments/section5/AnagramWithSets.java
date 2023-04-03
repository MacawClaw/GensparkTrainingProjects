package genspark.assignments.section5;

import genspark.assignments.Assignment;

import java.util.HashMap;
import java.util.HashSet;

public class AnagramWithSets implements Assignment {
    public boolean solution(String word1, String word2) {
        // ↓↓↓↓ your code goes here ↓↓↓↓

        /*
        if (word1.equals(word2) || word1.length() != word2.length()) return false;
        HashMap<Character, Integer> characterCount = new HashMap<>();
        HashMap<Character, Integer> characterCountTwo = new HashMap<>();

        for (int i = 0; i < word1.length(); i++) {
            char c = word1.charAt(i);
            char s = word2.charAt(i);
            if (characterCount.containsKey(c)) {
                characterCount.put(c, characterCount.get(c) + 1);
            } else {
                characterCount.put(c, 1);
            }

            if (characterCountTwo.containsKey(s)) {
                characterCountTwo.put(s, characterCountTwo.get(s) + 1);
            } else {
                characterCountTwo.put(s, 1);
            }
        }


        return characterCount.entrySet().stream().allMatch(x -> x.getValue().equals(characterCountTwo.get(x.getKey())));

         */
        if (word1.equals(word2) || word1.length() != word2.length()) return false;

        HashSet<Character> wordCharOne = new HashSet<Character>();
        HashSet<Character> wordCharTwo = new HashSet<Character>();

        for (int i = 0; i < word1.length(); i++) {
            wordCharOne.add(word1.charAt(i));
            wordCharTwo.add(word2.charAt(i));
        }

        return wordCharOne.equals(wordCharTwo);

    }
}
