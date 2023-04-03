package genspark.assignments.section8;

import genspark.assignments.Assignment;

import java.io.File;
import java.io.IOException;
import java.util.*;

public class OutgoingCallsFromBangalore implements Assignment {
    public String solution() throws IOException {
        // ↓↓↓↓ your code goes here ↓↓↓↓
        Scanner callScanner = new Scanner(new File("C:\\GenSpark\\genspark-java-core\\genspark-java-core\\src\\main\\resources\\calls.csv"));
        //HashSet<String> phoneNumbers = new HashSet<>();
        HashSet<String> areaCodes = new HashSet<>();

        //Read line
        while(callScanner.hasNextLine()) {
            String[] line = callScanner.nextLine().split(",");
            String phoneNumber= line[0];
            if(phoneNumber.substring(0,2).equals("(0")) {
                areaCodes.add(phoneNumber.substring(1,phoneNumber.indexOf(")")));
            } else if (phoneNumber.contains(" ") && phoneNumber.charAt(0) == '7' || phoneNumber.charAt(0) == '8' || phoneNumber.charAt(0) == '9') {
                areaCodes.add(phoneNumber.substring(0,4));
            } else if (phoneNumber.substring(0,3).equals("140")) {
                areaCodes.add(phoneNumber.substring(0,3));
            }
            //phoneNumbers.add(line[1]);
        }

        List<String> convertedCodes = new ArrayList<>(areaCodes);
        Collections.sort(convertedCodes);

        String bangaloreAreaCodes = "";
        for (String code: convertedCodes) {
            bangaloreAreaCodes = bangaloreAreaCodes + " " + code;
        }



        return bangaloreAreaCodes.substring(1);
    }
}
