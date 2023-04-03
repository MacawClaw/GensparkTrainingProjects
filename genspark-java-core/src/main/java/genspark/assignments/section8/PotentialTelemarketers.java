package genspark.assignments.section8;

import genspark.assignments.Assignment;

import java.io.File;
import java.io.IOException;
import java.util.*;

public class PotentialTelemarketers implements Assignment {
    public String solution() throws IOException {
        // ↓↓↓↓ your code goes here ↓↓↓↓
        Scanner callScanner = new Scanner(new File("C:\\GenSpark\\genspark-java-core\\genspark-java-core\\src\\main\\resources\\calls.csv"));
        Scanner textScanner = new Scanner(new File("C:\\GenSpark\\genspark-java-core\\genspark-java-core\\src\\main\\resources\\texts.csv"));
        HashSet<String> outgoingNumbers = new HashSet<>();
        HashSet<String> incomingNumbers = new HashSet<>();
        HashSet<String> outgoingTexts = new HashSet<>();
        HashSet<String> incomingTexts = new HashSet<>();
        ArrayList<String> potentialTelemarketers = new ArrayList<>();

        //Read line
        while(callScanner.hasNextLine()) {
            String[] line = callScanner.nextLine().split(",");
            outgoingNumbers.add(line[0]);
            incomingNumbers.add(line[1]);
        }

        while(textScanner.hasNextLine()) {
            String[] line = textScanner.nextLine().split(",");
            outgoingTexts.add(line[0]);
            incomingTexts.add(line[1]);
        }

        List<String> convertedNumbers = new ArrayList<>(outgoingNumbers);
        Collections.sort(convertedNumbers);

        for(String number: convertedNumbers) {
            if(!incomingNumbers.contains(number) && !outgoingTexts.contains(number) && !incomingTexts.contains(number)) {
                potentialTelemarketers.add(number);
            }
        }

        String telemarketers = "";
        for (String number: potentialTelemarketers) {
            telemarketers = telemarketers + " " + number;
        }
        return telemarketers.substring(1);
    }
}
