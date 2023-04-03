package genspark.assignments.section7;

import genspark.assignments.Assignment;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class QueryTheFile implements Assignment {
    public ArrayList<String> solution() throws IOException {
        // ↓↓↓↓ your code goes here ↓↓↓↓
        File file = new File("C:\\GenSpark\\genspark-java-core\\genspark-java-core\\src\\main\\resources\\filter_problem.text");

        BufferedReader br = new BufferedReader(new FileReader(file));
        ArrayList<String> lines = new ArrayList<>();
        String st;
        int i = 0;
        while((st = br.readLine()) != null) {
            lines.add(st);
            i++;
        }
        Stream<String> s = lines.stream();
        ArrayList<String> result = s.filter(l -> !l.contains("2")).collect(Collectors.toCollection(ArrayList::new));

        return result;
    }
}
