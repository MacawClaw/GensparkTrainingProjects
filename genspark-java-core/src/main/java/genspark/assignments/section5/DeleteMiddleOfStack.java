package genspark.assignments.section5;

import genspark.assignments.Assignment;
import java.util.Stack;

public class DeleteMiddleOfStack implements Assignment {
    public Stack<Integer> solution(Stack<Integer> stack) {
        // ↓↓↓↓ your code goes here ↓↓↓↓

        int s = stack.size();
        Stack<Integer> temp = new Stack<>();
        if (stack.empty() || stack.contains(null)) return stack;

        if (s == 1) {
            stack.pop();
            return stack;
        }

        int target = 0;
        if (s % 2 == 0) {
            target = (s/2);
        } else {
            target = (int) Math.ceil(s/2);
        }


        int i = 0;
        while(!stack.empty()) {
            if (i == target) {
                stack.pop();
            } else {
                temp.push(stack.pop());
            }
            i++;
        }

        while(!temp.empty()) {
            stack.push(temp.pop());
        }


        return stack;
    }
}
