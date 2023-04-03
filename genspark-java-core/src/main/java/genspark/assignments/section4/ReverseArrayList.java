package genspark.assignments.section4;

import genspark.assignments.Assignment;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class ReverseArrayList implements Assignment {
    public ArrayList<Integer> solution(ArrayList<Integer> list) {
        // ↓↓↓↓ your code goes here ↓↓↓↓
        if (list.size() == 0) return list;

        ArrayList<Integer> reversed = new ArrayList<>();
        for (int i = list.size()-1; i >= 0; i--) {
            reversed.add(list.get(i));
        }
        return reversed;
    }
}
