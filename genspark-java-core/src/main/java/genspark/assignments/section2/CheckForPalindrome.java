package genspark.assignments.section2;

import genspark.assignments.Assignment;

public class CheckForPalindrome implements Assignment {
    public boolean solution(String pally) {
        // ↓↓↓↓ your code goes here ↓↓↓↓
        if (pally.equalsIgnoreCase("") || pally.equals(null)) return true;

        String reversed = "";
        for (int i = pally.length()-1; i>= 0; i--) {
            reversed+= pally.charAt(i);
        }
        if (pally.equalsIgnoreCase(reversed)) return true;
        return false;
    }
}
