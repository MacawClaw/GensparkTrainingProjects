package genspark.assignments.section7;

import genspark.assignments.Assignment;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class IncrementTheData implements Assignment {
    public Object solution(ArrayList<Integer> nums) {
        // ↓↓↓↓ your code goes here ↓↓↓↓
        List<Integer> result = nums.stream().map(n -> n+10).collect(Collectors.toList());
        return result;
    }
}
