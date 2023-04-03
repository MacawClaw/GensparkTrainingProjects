package genspark.assignments.section3;

import genspark.assignments.Assignment;

public class DivideByZero implements Assignment {
    public Object solution(int one, int two) {
        // ↓↓↓↓ your code goes here ↓↓↓↓
        int quotient = 0;
        String message = "";

        try {
            if (two == 0) {
                throw new CantReturnZero();
            }
            else {
                quotient = one/two;
            }
            //quotient = one/two;
        } catch (Exception e) {
            message = e.getMessage();
        } finally {
            if (two == 0) {
                return message;
            }
            else {
                quotient = one/two;
                return quotient;
            }
        }
    }
}
