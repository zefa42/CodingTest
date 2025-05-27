package Programmers;

import java.util.*;

public class 괄호_회전하기 {
    public int solution(String s) {
        String sb = s + s;
        int result = 0;
        for(int i = 0; i < s.length(); ++i) {
            if(isValid(sb.substring(i, s.length() + i)))  {
                result++;
            }
        }
        return result;
    }

    public boolean isValid(String str) {
        Deque<Character> stack = new ArrayDeque<>();
        for(char c : str.toCharArray()) {
            if(c == '(' || c == '{' || c == '[') {
                stack.push(c);
            } else {
                if(stack.isEmpty()) {
                    return false;
                }

                char target = stack.pop();
                if(target == '(' && c != ')'||
                   target == '{' && c != '}'||
                   target == '[' && c != ']') {
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }
}