package genspark.assignments.section5;

import genspark.assignments.Assignment;

import java.util.ArrayList;
import java.util.HashMap;

public class CreateAHuman implements Assignment {
    public HashMap<String, Object> solution(String name, Long age) {
        // ↓↓↓↓ your code goes here ↓↓↓↓

        HashMap<String, Object> human = new HashMap<>();

        human.put("name", name);
        human.put("age", age);

        return human;

    }
}
