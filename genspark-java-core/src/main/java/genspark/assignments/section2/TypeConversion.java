package genspark.assignments.section2;

import genspark.assignments.Assignment;

public class TypeConversion implements Assignment {
    public Object solution(Object object) {
        // ↓↓↓↓ your code goes here ↓↓↓↓
        if (object instanceof Integer) {
            return "" + object;
        }
        else if (object instanceof String) {
            return Integer.parseInt((String) object);
        }
        else if (object instanceof Character) {
            return "" + object;
        }
        return null;
    }
}
