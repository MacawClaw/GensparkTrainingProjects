package genspark.assignments.section3;

import genspark.assignments.Assignment;

public class ParsingAnInteger implements Assignment {
    public Object solution(String word) {
        // ↓↓↓↓ your code goes here ↓↓↓↓
        String message = "";
        int newValue = 0;

        try {
            newValue = Integer.parseInt(word);
            return newValue;
            //quotient = one/two;
        } catch (Exception e) {
            return "Caught Exception: Number Format Exception";
        }
    }
}
