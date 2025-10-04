package Programmers;

import java.util.Stack;

public class 올바른_괄호 {
    boolean solution(String s) {
        Stack<Character> stack = new Stack<>();
        for(int i = 0; i < s.length(); ++i) {
            char c = s.charAt(i);
            if(c == '(') stack.push(c);
            else {
                if(stack.isEmpty()) return false;
                if(stack.pop() != '(') {
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }
}
