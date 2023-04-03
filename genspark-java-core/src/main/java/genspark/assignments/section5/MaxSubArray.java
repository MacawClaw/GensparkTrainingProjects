package genspark.assignments.section5;

import genspark.assignments.Assignment;
import java.util.ArrayList;

public class MaxSubArray implements Assignment {

    public ArrayList<Integer> solution(ArrayList<Integer> nums) {
        // ↓↓↓↓ your code goes here ↓↓↓↓
        int size = nums.size();
        if (size == 0 || size == 1) return nums;

        int max_sum = 0;
        int start = 0;
        int end = 0;
        int working_sum = 0;
        int working_start = 0; //temp start position
        ArrayList<Integer> subArray = new ArrayList<>();

        for (int i = 0; i < size; i++) {
            working_sum += nums.get(i);

            //reset if less than 0
            if(working_sum <= 0) {
                working_sum = 0;
                working_start = i +1;
            }

            if (working_sum > max_sum) {
                max_sum = working_sum;
                end = i;
                start = working_start;
            }
        }

        for (int i = start; i <= end; i++) {
            subArray.add(nums.get(i));
        }

        return subArray;
    }
}
