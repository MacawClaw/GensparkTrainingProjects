package genspark.assignments.section4;

import genspark.assignments.Assignment;

import java.util.ArrayList;

public class ReversePositiveInteger implements Assignment {
    public int solution(int number) {
        // ↓↓↓↓ your code goes here ↓↓↓↓
        int reversed = 0;
        ArrayList<Integer> digits = new ArrayList<>();

        while (number != 0) {
            digits.add(number %10);
            number /= 10;
        }

        for (int i = 0; i < digits.size(); i++) {
            reversed = reversed*10 + digits.get(i);
        }
        return reversed;
    }
}
