package genspark.assignments.section7;

import genspark.assignments.Assignment;
import java.util.ArrayList;

public class RemoveTheOddBalls implements Assignment {
    public Object[] solution(ArrayList<String> words) {
        // ↓↓↓↓ your code goes here ↓↓↓↓
        Object[] result = words.stream().filter(word -> word.length() %2 == 0).toArray();
        return result;
    }
}
