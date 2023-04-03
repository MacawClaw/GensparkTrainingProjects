package genspark.assignments.section4;

import genspark.assignments.Assignment;
import java.util.ArrayList;

public class FindMissingInteger implements Assignment {
    public int solution(ArrayList<Integer> numbers) {
        // ↓↓↓↓ your code goes here ↓↓↓↓
        if (numbers.size() == 0) return 0;

        for (int i = 0; i < numbers.size(); i++) {
            if (i + 1 != numbers.get(i)) {
                return i + 1;
            }
        }
        return 0;
    }
}
