import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;

public class Number_28279 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int count = Integer.parseInt(bufferedReader.readLine());
        StringBuilder result = new StringBuilder();
        Deque<Integer> dequeue = new ArrayDeque<>();
        for(int i = 0; i < count; ++i) {
            String input = bufferedReader.readLine();
            if(input.length() > 1) {
                String[] numbers = input.split(" ");
                int first = Integer.parseInt(numbers[0]);
                int second = Integer.parseInt(numbers[1]);
                if(first == 1) {
                    dequeue.addFirst(second);
                }
                else if(first == 2) {
                    dequeue.add(second);
                }
            }
            else {
                int number = Integer.parseInt(input);
                if(number == 3) {
                    if(dequeue.isEmpty()) {
                        result.append("-1").append('\n');
                    }
                    else {
                        result.append(dequeue.getFirst()).append('\n');
                        dequeue.removeFirst();
                    }
                }
                if(number == 4) {
                    if(dequeue.isEmpty()) {
                        result.append("-1").append('\n');
                    }
                    else {
                        result.append(dequeue.getLast()).append('\n');
                        dequeue.removeLast();
                    }
                }
                if(number == 5) {
                    result.append(dequeue.size()).append('\n');
                }
                if(number == 6) {
                    if(dequeue.isEmpty()) {
                        result.append("1").append('\n');
                    }
                    else {
                        result.append("0").append('\n');
                    }
                }
                if(number == 7) {
                    if(dequeue.isEmpty()) {
                        result.append("-1").append('\n');
                    }
                    else {
                        result.append(dequeue.getFirst()).append('\n');
                    }
                }
                if(number == 8) {
                    if(dequeue.isEmpty()) {
                        result.append("-1").append('\n');
                    }
                    else {
                        result.append(dequeue.getLast()).append('\n');
                    }
                }
            }
        }
        System.out.println(result);
    }
}
