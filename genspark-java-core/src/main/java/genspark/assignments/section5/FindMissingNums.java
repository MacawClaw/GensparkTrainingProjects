package genspark.assignments.section5;

import genspark.assignments.Assignment;
import java.util.ArrayList;

public class FindMissingNums implements Assignment {
    public ArrayList<Integer> solution(ArrayList<Integer> nums) {
        // ↓↓↓↓ your code goes here ↓↓↓↓

        ArrayList<Integer> missing = new ArrayList<>();

        for (int i = 1; i <= 100; i++) {
            if (!nums.contains(i)) missing.add(i);
        }
        return missing;
    }
}
