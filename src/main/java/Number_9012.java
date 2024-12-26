import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Number_9012 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int count = Integer.parseInt(bufferedReader.readLine());
        StringBuilder result = new StringBuilder();
        for(int i = 0; i < count; ++i) {
            String roundResult = "YES";
            char[] parenthesis = bufferedReader.readLine().toCharArray();
            Stack<Character> stack = new Stack<>();
            for(int j = 0; j < parenthesis.length; ++j) {
                if (parenthesis[j] == '(') {
                    stack.push('(');
                } else if (parenthesis[j] == ')') {
                    if (stack.isEmpty()) {
                        roundResult = "NO";
                        break;
                    }
                    stack.pop();
                }
            }
            if(!stack.isEmpty()){
                roundResult = "NO";
            }
            result.append(roundResult).append('\n');
        }
        System.out.println(result);
    }
}
