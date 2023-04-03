package genspark.assignments.section2;

import genspark.assignments.Assignment;

public class HumanGoblin implements Assignment {
    public String solution(String str) {
        // ↓↓↓↓ your code goes here ↓↓↓↓
        if (str.equalsIgnoreCase("goblin")) {
            return "Attack the Goblin!";
        }
        else if (str.equalsIgnoreCase("human")) {
            return "You aRe one of us!";
        }
        return null;
    }
}
