import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Queue;

public class Number_11279 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int count = Integer.parseInt(bufferedReader.readLine());
        Queue<Integer> numbers = new PriorityQueue<>(Collections.reverseOrder());
        StringBuilder result = new StringBuilder();
        for(int i = 0; i < count; ++i) {
            int input = Integer.parseInt(bufferedReader.readLine());
            if(input == 0) {
                if(numbers.isEmpty()) {
                    result.append("0").append('\n');
                }
                else {
                    result.append(numbers.poll()).append('\n');
                }
            }
            else {
                numbers.add(input);
            }
        }
        System.out.println(result);
     }
}
