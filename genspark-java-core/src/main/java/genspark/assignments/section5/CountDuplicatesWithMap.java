package genspark.assignments.section5;

import genspark.assignments.Assignment;
import java.util.ArrayList;
import java.util.HashMap;

public class CountDuplicatesWithMap implements Assignment {
    public HashMap<Integer,Integer> solution(ArrayList<Integer> nums) {
        // ↓↓↓↓ your code goes here ↓↓↓↓
        HashMap<Integer, Integer> intCount = new HashMap<>();
        if (nums.size() == 0) return intCount;

        for (int i = 0; i < nums.size(); i++) {
            int c = nums.get(i);
            if (intCount.containsKey(c)) {
                intCount.put(c, intCount.get(c) + 1);
            } else {
                intCount.put(c, 1);
            }
        }

        return intCount;
    }
}
