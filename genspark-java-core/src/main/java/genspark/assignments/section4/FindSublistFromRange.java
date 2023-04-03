package genspark.assignments.section4;

import genspark.assignments.Assignment;
import java.util.ArrayList;

public class FindSublistFromRange implements Assignment {
    public ArrayList<Integer> solution(ArrayList<Integer> elms, int from, int to) {
        // ↓↓↓↓ your code goes here ↓↓↓↓
        ArrayList<Integer> sublist = new ArrayList<>();

        if(elms.size() == 0 || from == to) return sublist;

        for (int i = from; i < to; i++) {
            sublist.add(elms.get(i));
        }

        return sublist;
    }
}
