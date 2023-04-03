package genspark.assignments.section8;

import genspark.assignments.Assignment;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;


public class RecordOfTextsAndCalls implements Assignment {
    public String[] solution() throws IOException {
        // ↓↓↓↓ your code goes here ↓↓↓↓
        Scanner callScanner = new Scanner(new File("C:\\GenSpark\\genspark-java-core\\genspark-java-core\\src\\main\\resources\\calls.csv"));
        Scanner textScanner = new Scanner(new File("C:\\GenSpark\\genspark-java-core\\genspark-java-core\\src\\main\\resources\\texts.csv"));
        ArrayList<String> callEntries = new ArrayList<>();
        ArrayList<String> textEntries = new ArrayList<>();
        String[] firstAndLast = new String[2];

        //Read line
        while(callScanner.hasNextLine()) {
            callEntries.add(callScanner.nextLine());
        }

        while(textScanner.hasNextLine()) {
            textEntries.add(textScanner.nextLine());
        }

        String[] firstText = textEntries.get(0).split(",");
        String[] lastCall = callEntries.get(callEntries.size()-1).split(",");

        firstAndLast[0] = "First record of texts, " + firstText[0] + " texts " + firstText[1]
                + " at time " + firstText[2];
        firstAndLast[1] = "Last record of calls, " + lastCall[0] + " calls " + lastCall[1]
                + " at time " +  lastCall[2] + ", lasting " + lastCall[3] + " seconds";

        for (int i = 0; i<1; i++) {
            System.out.println("Here");
        }

        return firstAndLast;
    }
}
