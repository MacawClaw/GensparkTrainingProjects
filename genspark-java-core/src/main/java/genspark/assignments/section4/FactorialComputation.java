package genspark.assignments.section4;

import genspark.assignments.Assignment;

public class FactorialComputation implements Assignment {
    public int solution(int n) {
        // ↓↓↓↓ your code goes here ↓↓↓↓
        if (n == 0 || n == 1) return 1;
        int product = 1;

        while (n > 0) {
            product *= n;
            n--;
        }
        return product;
    }
}
