package genspark.assignments.section5;

import genspark.assignments.Assignment;
import java.util.ArrayList;

public class AddOneToArrayList implements Assignment {
    public ArrayList<Integer> solution(ArrayList<Integer> list) {
        // ↓↓↓↓ your code goes here ↓↓↓↓
        int i = list.size() -1;

        while (i != -1) {
            list.set(i,list.get(i) + 1);
            if (list.get(i) > 9) {
                list.set(i, 0);
                i--;
            } else {
                i = -1;
            }
        }
        return list;
    }
}
