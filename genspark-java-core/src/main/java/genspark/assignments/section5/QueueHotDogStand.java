package genspark.assignments.section5;

import genspark.assignments.Assignment;
import java.util.ArrayList;

public class QueueHotDogStand implements Assignment {
    public ArrayList<Integer> solution(ArrayList<Integer> list) {
        // ↓↓↓↓ your code goes here ↓↓↓↓
        if (list.size() == 0) return list;

        int rotations = 3;

        for (int i = 0; i < rotations; i++) {
            list.add(list.get(0));
            list.remove(0);
        }

        return list;
    }
}
