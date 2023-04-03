package genspark.assignments.section5;

import genspark.assignments.Assignment;

import java.util.Stack;

public class ReverseStringStack implements Assignment {
    public String solution(String word) {
        // ↓↓↓↓ your code goes here ↓↓↓↓
        Stack<Character> tempStack = new Stack<>();
        String reversed = "";

        for (int i = 0; i<word.length(); i++) {
            tempStack.push(word.charAt(i));
        }

        for (int i = 0; i<word.length(); i++) {
            reversed += tempStack.pop();
        }

        return reversed;
    }
}
