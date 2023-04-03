package genspark.assignments.section4;

import genspark.assignments.Assignment;
import java.util.ArrayList;

public class IterateThroughArrayList implements Assignment {
    public ArrayList<Integer> solution(ArrayList<String> myList) {
        // ↓↓↓↓ your code goes here ↓↓↓↓
        ArrayList<Integer> characterCount = new ArrayList<>();

        for (int i = 0; i < myList.size(); i++) {
            characterCount.add(myList.get(i).length());
        }
        return characterCount;
    }
}
