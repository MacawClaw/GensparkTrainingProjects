package genspark.assignments.section5;

import genspark.assignments.Assignment;
import java.util.ArrayList;
import java.util.ListIterator;

public class NthRowPascal implements Assignment {
    public ArrayList<Integer> solution(int nth) {
        // ↓↓↓↓ your code goes here ↓↓↓↓
        ArrayList<Integer> mthRow;
        ArrayList<Integer> nthRow = new ArrayList<>();
        int k = 0;

        nthRow.add(1);
        if (nth == 0) return nthRow;

        nthRow.add(1);
        if (nth == 1) return nthRow;

        for (int i = 2; i <= nth; i++) {
            mthRow = new ArrayList<>(nthRow);
            ListIterator<Integer> iter = mthRow.listIterator();
            k = 1;

            while (iter.hasNext()) {
                nthRow.set(k,(mthRow.get(k-1) + mthRow.get(k)));
                k++;

                if (k == mthRow.size()) break;
            }

            nthRow.add(1);

        }

        return nthRow;
    }
}
