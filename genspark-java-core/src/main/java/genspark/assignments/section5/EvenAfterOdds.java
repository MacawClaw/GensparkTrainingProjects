package genspark.assignments.section5;

import genspark.assignments.Assignment;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class EvenAfterOdds implements Assignment {
    public ArrayList<Integer> solution(ArrayList<Integer> nums) {
        // ↓↓↓↓ your code goes here ↓↓↓↓
        ArrayList<Integer> odds = new ArrayList<>();
        ArrayList<Integer> evens = new ArrayList<>();
        ArrayList<Integer> arranged = new ArrayList<>();

        for (int i = 0; i < nums.size(); i++) {
            if (nums.get(i) % 2 == 0) {
                evens.add(nums.get(i));
            } else {
                odds.add(nums.get(i));
            }
        }

        for (int i = 0; i < odds.size(); i++) {
            arranged.add(odds.get(i));
        }
        for (int i = 0; i < evens.size(); i++) {
            arranged.add(evens.get(i));
        }

        return arranged;

    }
}
