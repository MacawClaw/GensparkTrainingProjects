package genspark.assignments.section8;

import genspark.assignments.Assignment;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

public class TotalNumberOfCalls implements Assignment {
    public int solution() throws IOException {
        Scanner callScanner = new Scanner(new File("C:\\GenSpark\\genspark-java-core\\genspark-java-core\\src\\main\\resources\\calls.csv"));
        Scanner textScanner = new Scanner(new File("C:\\GenSpark\\genspark-java-core\\genspark-java-core\\src\\main\\resources\\texts.csv"));
        HashSet<String> phoneNumbers = new HashSet<>();

        //Read line
        while(callScanner.hasNextLine()) {
            String[] line = callScanner.nextLine().split(",");
            phoneNumbers.add(line[0]);
            phoneNumbers.add(line[1]);
        }

        while(textScanner.hasNextLine()) {
            String[] line = textScanner.nextLine().split(",");
            phoneNumbers.add(line[0]);
            phoneNumbers.add(line[1]);
        }

        return phoneNumbers.size();
    }
}

