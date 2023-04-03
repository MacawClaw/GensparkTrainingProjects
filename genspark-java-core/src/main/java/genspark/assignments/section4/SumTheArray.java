package genspark.assignments.section4;

import genspark.assignments.Assignment;

public class SumTheArray implements Assignment {
    public int solution(int[] numbers) {
        // ↓↓↓↓ your code goes here ↓↓↓↓
        if (numbers.length == 0) return 0;

        int sum =0;
        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
        }
        return sum;
    }
}
