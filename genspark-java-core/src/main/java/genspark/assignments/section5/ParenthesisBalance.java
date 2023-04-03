package genspark.assignments.section5;

import genspark.assignments.Assignment;
import java.util.Stack;

public class ParenthesisBalance implements Assignment {
    public String solution(String s) {
        // ↓↓↓↓ your code goes here ↓↓↓↓
        if (s.equalsIgnoreCase("")) return "unbalanced";

        char[] charArray = s.toCharArray();
        int openCounter = 0, closingCounter = 0, acommpanyingClosingCounter = 0;

        for (int i = 0; i < charArray.length; i++) {
            if (charArray[i] == '(') openCounter++;
            if (charArray[i] == ')') closingCounter++;
            if (charArray[i] == ')' && openCounter > acommpanyingClosingCounter) acommpanyingClosingCounter++;
        }

        if (openCounter == closingCounter && closingCounter == acommpanyingClosingCounter) {
            return "balanced";
        } else {
            return "unbalanced";
        }
    }
}
