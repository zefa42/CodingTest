import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Number_10773 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int count = Integer.parseInt(bufferedReader.readLine());
        Stack<Integer> stack = new Stack<>();
        int sum = 0;
        for(int i = 0; i < count; ++i) {
            int number = Integer.parseInt(bufferedReader.readLine());
            if(number == 0) {
                sum -= stack.pop();
            }
            else {
                sum += number;
                stack.push(number);
            }
        }
        System.out.println(sum);
    }
}
