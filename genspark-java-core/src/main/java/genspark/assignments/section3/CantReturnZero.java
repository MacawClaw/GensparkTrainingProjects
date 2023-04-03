package genspark.assignments.section3;

public class CantReturnZero extends Exception{
    @Override
    public String getMessage() {
        return "Caught Exception: Divide by zero";
    }
}
