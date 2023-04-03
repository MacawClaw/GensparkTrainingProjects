package genspark.assignments.section3;

import genspark.assignments.Assignment;

public class IndexOutBounds implements Assignment {
    public Object solution(int[] array, int index) {
        // ↓↓↓↓ your code goes here ↓↓↓↓
        String message = "";

        try {
            if (index > array.length - 1 || index < 0) {
                throw new OutOfBounds();
            }
            //quotient = one/two;
        } catch (Exception e) {
            message = e.getMessage();
        } finally {
            if (index > array.length - 1 || index < 0) {
                return message;
            }
            else {
                return array[index];
            }
        }
    }
}
