package genspark.assignments.section5;

import genspark.assignments.Assignment;
import org.checkerframework.checker.units.qual.A;

import java.util.ArrayList;

public class RemoveDuplicatesFromArray implements Assignment {
    public int[] solution(int[] nums) {
        // ↓↓↓↓ your code goes here ↓↓↓↓
        ArrayList<Integer> temp = new ArrayList<>();

        for (int num: nums) {
            if (!temp.contains(num)) {
                temp.add(num);
            }
        }

        int[] uniqueSet = new int[temp.size()];

        for (int i = 0; i < temp.size(); i++) {
            uniqueSet[i] = temp.get(i);
        }

        return uniqueSet;
    }
}
