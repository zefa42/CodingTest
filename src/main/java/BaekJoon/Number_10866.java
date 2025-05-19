import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Deque;
import java.util.LinkedList;

public class Number_10866 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int count = Integer.parseInt(bufferedReader.readLine());
        Deque<Integer> deque = new LinkedList<>();
        StringBuilder result = new StringBuilder();
        for(int i = 0; i < count; ++i) {
            String input = bufferedReader.readLine();
            if(input.startsWith("push_front")) {
                deque.addFirst(Integer.parseInt(input.split(" ")[1]));
            }
            if(input.startsWith("push_back")) {
                deque.addLast(Integer.parseInt(input.split(" ")[1]));
            }
            if(input.startsWith("pop_front")) {
                if(deque.isEmpty()) {
                    result.append("-1").append('\n');
                }
                else {
                    result.append(deque.getFirst()).append('\n');
                    deque.removeFirst();
                }
            }
            if(input.startsWith("pop_back")){
                if(deque.isEmpty()) {
                    result.append("-1").append('\n');
                }
                else {
                    result.append(deque.getLast()).append('\n');
                    deque.removeLast();
                }
            }
            if(input.startsWith("s")) {
                result.append(deque.size()).append('\n');
            }
            if(input.startsWith("e")) {
                if(deque.isEmpty()) {
                    result.append("1").append('\n');
                }
                else {
                    result.append("0").append('\n');
                }
            }
            if(input.equals("front")) {
                if(deque.isEmpty()) {
                    result.append("-1").append('\n');
                }
                else {
                    result.append(deque.getFirst()).append('\n');
                }
            }
            if(input.equals("back")) {
                if(deque.isEmpty()) {
                    result.append("-1").append('\n');
                }
                else {
                    result.append(deque.getLast()).append('\n');
                }
            }
        }
        System.out.println(result);
    }
}
