package genspark.assignments.section7;

import genspark.assignments.Assignment;

import java.util.Arrays;

public class SumAnArray implements Assignment {
    public int solution(int[] nums) {
        // ↓↓↓↓ your code goes here ↓↓↓↓
        int summation = Arrays.stream(nums).reduce(0,Integer::sum);
        return summation;
    }
}
