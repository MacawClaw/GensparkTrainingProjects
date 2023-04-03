package genspark.assignments.section4;

import genspark.assignments.Assignment;

import java.util.Arrays;
import java.util.HashMap;

public class AnagramComputation implements Assignment {
    public boolean solution(String word1, String word2) {
        // ↓↓↓↓ your code goes here ↓↓↓↓
        if (word1.equals(word2) || word1.length() != word2.length()) return false;

        char[] charArray1 = word1.toCharArray();
        char[] charArray2 = word2.toCharArray();

        Arrays.sort(charArray1);
        Arrays.sort(charArray2);


        return Arrays.equals(charArray1, charArray2);
    }
}
