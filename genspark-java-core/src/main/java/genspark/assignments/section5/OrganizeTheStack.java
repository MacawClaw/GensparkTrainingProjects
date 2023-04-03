package genspark.assignments.section5;

import genspark.assignments.Assignment;
import java.util.Stack;

public class OrganizeTheStack implements Assignment {
    public Stack<Integer> solution(Stack<Integer> stack) {
        // ↓↓↓↓ your code goes here ↓↓↓↓
        Stack<Integer> tempStack = new Stack<>();
        while(!stack.isEmpty()) {
            int temp = stack.pop();

            while(!tempStack.isEmpty() && tempStack.peek() < temp) {
                stack.push(tempStack.pop());
            }

            tempStack.push(temp);
        }

        return tempStack;
    }
}
