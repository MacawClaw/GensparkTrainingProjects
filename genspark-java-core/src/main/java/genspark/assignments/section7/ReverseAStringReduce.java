package genspark.assignments.section7;

import genspark.assignments.Assignment;

import java.util.Arrays;
import java.util.stream.Stream;

public class ReverseAStringReduce implements Assignment {
    public String solution(String word) {
        // ↓↓↓↓ your code goes here ↓↓↓↓
        String reversed = "";
        Stream<String> wordStream = Arrays.stream(word.split(""));
        reversed = wordStream.reduce((wordForming, letter) -> letter + wordForming).orElse("");
        return reversed;
    }
}
