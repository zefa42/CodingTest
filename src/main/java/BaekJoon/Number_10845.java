import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;

public class Number_10845 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int count = Integer.parseInt(bufferedReader.readLine());
        Deque<Integer> queue = new ArrayDeque<>();
        StringBuilder result = new StringBuilder();
        for(int i = 0; i < count; ++i) {
            String input = bufferedReader.readLine();
            if(input.contains("push")) {
                queue.add(Integer.parseInt(input.split(" ")[1]));
            }
            if(input.equals("pop")) {
                if (queue.isEmpty()) {
                    result.append("-1").append('\n');
                } else {
                    result.append(queue.poll()).append('\n');
                }
            }
            if(input.equals("size")) {
                result.append(queue.size()).append('\n');
            }
            if(input.equals("empty")) {
                if(queue.isEmpty()) {
                    result.append(1).append('\n');
                } else {
                    result.append(0).append('\n');
                }
            }
            if(input.equals("front")) {
                if(queue.isEmpty()) {
                    result.append(-1).append('\n');
                } else {
                    result.append(queue.getFirst()).append('\n');
                }
            }
            if(input.equals("back")) {
                if(queue.isEmpty()) {
                    result.append(-1).append('\n');
                } else {
                    result.append(queue.getLast()).append('\n');
                }
            }
        }
        System.out.println(result);
    }
}
