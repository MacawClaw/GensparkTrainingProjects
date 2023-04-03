package genspark.assignments.section2;

import genspark.assignments.Assignment;

public class ReverseAnInteger implements Assignment {
    public String solution(int number) {
        // ↓↓↓↓ your code goes here ↓↓↓↓
        String num = Integer.toString(number);

        String reversed = "";
        for (int i = num.length()-1; i>= 0; i--) {
            reversed+= num.charAt(i);
        }
        return reversed;
    }
}
