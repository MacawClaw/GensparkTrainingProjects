package genspark.assignments.section8;

import genspark.assignments.Assignment;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Scanner;

public class LongestCall implements Assignment {
    public String solution() throws IOException {
        // ↓↓↓↓ your code goes here ↓↓↓↓
        Scanner callScanner = new Scanner(new File("C:\\GenSpark\\genspark-java-core\\genspark-java-core\\src\\main\\resources\\calls.csv"));
        HashMap<String, Integer> numberDuration = new HashMap<>();
        String mostActiveNumber = "";

        while(callScanner.hasNextLine()) {
            String[] line = callScanner.nextLine().split(",");
            int duration = Integer.parseInt(line[3]);

            //For Outgoing Number
            if (numberDuration.containsKey(line[0])) {
                numberDuration.put(line[0], numberDuration.get(line[0]) + duration);
            } else {
                numberDuration.put(line[0], duration);
            }

            //For Incoming Number
            if (numberDuration.containsKey(line[1])) {
                numberDuration.put(line[1], numberDuration.get(line[1]) + duration);
            } else {
                numberDuration.put(line[1], duration);
            }

        }

        int mostTimeSpent = 0;
        for (String key: numberDuration.keySet()) {
            if (numberDuration.get(key) > mostTimeSpent) {
                mostTimeSpent = numberDuration.get(key);
                mostActiveNumber = key;
            }
        }

        return mostActiveNumber;
    }
}
