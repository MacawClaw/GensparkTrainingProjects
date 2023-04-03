package genspark.assignments.section7;

import genspark.assignments.Assignment;
import java.util.Arrays;

public class RemoveOddsFromArray implements Assignment {
    public int[] solution(int[] nums) {
        // ↓↓↓↓ your code goes here ↓↓↓↓
        int[] result = Arrays.stream(nums).filter(n -> n%2 ==0).toArray();
        return result;
    }
}
