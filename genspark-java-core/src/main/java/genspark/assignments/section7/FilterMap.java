package genspark.assignments.section7;

import genspark.assignments.Assignment;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FilterMap implements Assignment {
    public Object[] solution(ArrayList<ArrayList<Integer>> listolists) {
        // ↓↓↓↓ your code goes here ↓↓↓↓
        Object[] result = listolists.stream()
                .filter(innerList -> innerList.size()%2 != 0)
                .map(innerList -> innerList.stream().map(n -> n*10).collect(Collectors.toList()))
                .toArray();
       return result;
    }
}
