package genspark.assignments.section2;

import genspark.assignments.Assignment;

public class IncrementWhileLoop implements Assignment {
    public String solution(int from, int to) {
        // ↓↓↓↓ your code goes here ↓↓↓↓
        String s = "";
        if (from > to) return s;

        int i = from;
        while (i <= to) {
            s+= Integer.toString(i);
            i++;
        }
        return s;
    }
}
