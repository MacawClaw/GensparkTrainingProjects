package genspark.assignments.section2;

import genspark.assignments.Assignment;

import java.util.Arrays;

public class MeanMedian implements Assignment {
    public String solution(int a, int b, int c) {
        // ↓↓↓↓ your code goes here ↓↓↓↓
        int[] numbers = {a, b, c};
        Arrays.sort(numbers);

        float sum= 0;
        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
        }
        String mean = Float.toString(sum/numbers.length);
        String median = Integer.toString(numbers[1]);



        return mean + " " + median;
    }
}
