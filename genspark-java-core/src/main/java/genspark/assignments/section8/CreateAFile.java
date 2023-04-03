package genspark.assignments.section8;

import genspark.assignments.Assignment;

import java.io.*;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CreateAFile implements Assignment {

    public void createAFile() throws IOException {
        Charset utf8 = StandardCharsets.UTF_8;
        String s = "";
        Files.write(Paths.get("C:\\GenSpark\\genspark-java-core\\genspark-java-core\\src\\main\\java\\genspark\\assignments\\section8\\sample_data.txt"), s.getBytes(),StandardOpenOption.CREATE);
    }

    public void writeToAFile() throws IOException{
        Charset utf8 = StandardCharsets.UTF_8;
        String s = "test";
        Files.write(Paths.get("C:\\GenSpark\\genspark-java-core\\genspark-java-core\\src\\main\\java\\genspark\\assignments\\section8\\sample_data.txt"), s.getBytes(),
                StandardOpenOption.CREATE);
    }

    public ArrayList<Character> readAFile() throws IOException{
        ArrayList<Character> charList = new ArrayList<>();

        List<String> stringList = Files.readAllLines(Paths.get("C:\\GenSpark\\genspark-java-core\\genspark-java-core\\src\\main\\java\\genspark\\assignments\\section8\\sample_data.txt"), StandardCharsets.UTF_8);

        Arrays.stream(stringList.get(0).split("")).forEach(c -> charList.add(c.charAt(0)));

        System.out.println("Here");
        //for(int i = 0; i < 1; i++) {

        //}
        return charList;
    }
}
