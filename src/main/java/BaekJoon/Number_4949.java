import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Number_4949 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        while(true) {
            String input = bufferedReader.readLine();
            if(input.equals(".")) {
                break;
            }

            Stack<Character> stack = new Stack<>();
            boolean isValid = true;
            for(int i = 0; i < input.length(); ++i) {
                if(input.charAt(i) == '(') {
                    stack.push('(');
                }
                if(input.charAt(i) == '[') {
                    stack.push('[');
                }
                if(input.charAt(i) == ')') {
                    if(stack.isEmpty() || stack.peek() == '[') {
                        isValid = false;
                        break;
                    }
                    else {
                        stack.pop();
                    }
                }
                if(input.charAt(i) == ']') {
                    if(stack.isEmpty() || stack.peek() == '(') {
                        isValid = false;
                        break;
                    }
                    else {
                        stack.pop();
                    }
                }
            }
            if(!stack.isEmpty()) {
                isValid = false;
            }

            if(isValid) {
                System.out.println("yes");
            }
            else {
                System.out.println("no");
            }
        }
    }
}
