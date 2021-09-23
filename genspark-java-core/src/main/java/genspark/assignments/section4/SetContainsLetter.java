package genspark.assignments.section4;

import genspark.assignments.Assignment;

import java.util.HashSet;

public class SetContainsLetter implements Assignment {
    public Object solution(HashSet<Integer> nums, int elm) {
        // ↓↓↓↓ your code goes here ↓↓↓↓
        if(nums.contains(elm)){
            return elm;
        } else {
            return "?";
        }
    }
}
