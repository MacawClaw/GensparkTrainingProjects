package genspark.assignments.section7;

import genspark.assignments.Assignment;
import java.util.ArrayList;

public class MapReduce implements Assignment {
    public int[] solution(ArrayList<ArrayList<Integer>> innerNums) {
        // ↓↓↓↓ your code goes here ↓↓↓↓
        int[] result = innerNums.stream().mapToInt(innerList -> innerList.stream().reduce(Integer::sum).orElse(0)).toArray();

        return result;
    }
}
