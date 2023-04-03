package genspark.assignments.section2;

import genspark.assignments.Assignment;

public class ReverseAStringWhileLoop implements Assignment {
    public String solution(String str) {
        // ↓↓↓↓ your code goes here ↓↓↓↓
        int i = str.length() - 1;
        String reversed = "";
        while (i >= 0) {
            reversed+= str.charAt(i);
            i--;
        }
        return reversed;
    }
}
