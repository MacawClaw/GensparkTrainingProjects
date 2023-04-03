package genspark.assignments.section4;

import genspark.assignments.Assignment;
import java.util.ArrayList;

public class FindMaxMinArray implements Assignment {
    public ArrayList<Long> solution(int[] nums) {
        // ↓↓↓↓ your code goes here ↓↓↓↓
        ArrayList<Long> largeSmall = new ArrayList<>();
        //max value
        largeSmall.add(0l);
        //min value
        largeSmall.add(0l);

        if (nums.length == 0) return largeSmall;

        int max = nums[0];
        int min = nums[0];

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > max) max = nums[i];
            if (nums[i] < min) min = nums[i];
        }

        largeSmall.set(0,(long)max);
        largeSmall.set(1,(long)min);

        return largeSmall;
    }
}
