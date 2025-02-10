import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Number_10828 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int count = Integer.parseInt(bufferedReader.readLine());
        Stack<Integer> stack = new Stack<>();
        StringBuilder result = new StringBuilder();
        for(int i = 0; i < count; ++i) {
            processStack(stack, bufferedReader, result);
        }
        System.out.println(result);
    }

    private static void processStack(Stack<Integer> stack, BufferedReader bufferedReader, StringBuilder result) throws IOException {
        String input = bufferedReader.readLine();
        if(input.equals("pop")) {
            if(stack.isEmpty()) {
                result.append("-1").append('\n');
            }
            else {
                result.append(stack.pop()).append('\n');
            }
        }
        if(input.equals("size")) {
            result.append(stack.size()).append('\n');
        }
        if(input.equals("empty")) {
            if(stack.isEmpty()) {
                result.append("1").append('\n');
            }
            else {
                result.append("0").append('\n');
            }
        }
        if(input.equals("top")) {
            if(stack.isEmpty()) {
                result.append("-1").append('\n');
            }
            else {
                result.append(stack.peek()).append('\n');
            }
        }
        if(input.startsWith("push")) {
            stack.push(Integer.parseInt(input.split(" ")[1]));
        }
    }
}
