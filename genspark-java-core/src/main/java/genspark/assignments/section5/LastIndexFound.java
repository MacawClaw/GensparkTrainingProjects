package genspark.assignments.section5;

import genspark.assignments.Assignment;
import java.util.ArrayList;

public class LastIndexFound implements Assignment {
    public int solution(ArrayList<Integer> nums, int numToFind) {
        // ↓↓↓↓ your code goes here ↓↓↓↓
        if (!nums.contains(numToFind)) return -1;

        int index = nums.indexOf(numToFind);

        return index;
    }
}
