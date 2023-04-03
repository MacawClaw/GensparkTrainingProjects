package genspark.assignments.section3;

public class OutOfBounds extends Exception{
    @Override
    public String getMessage() {
        return "Caught Exception: Index Out of Bounds.";
    }
}
