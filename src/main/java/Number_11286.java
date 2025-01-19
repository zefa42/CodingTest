import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;

public class Number_11286 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int count = Integer.parseInt(bufferedReader.readLine());
        PriorityQueue<Long> queue = new PriorityQueue<>();

        StringBuilder result = new StringBuilder();
        List<Long> minusNumbers = new ArrayList<>();
        for(int i = 0; i < count; ++i) {
            long input = Long.parseLong(bufferedReader.readLine());
            if(input == 0) {
                if(queue.isEmpty()) {
                    result.append(0).append('\n');
                }
                else {
                    long peek = -queue.peek();
                    if(minusNumbers.contains(peek)) {
                        result.append(-(queue.poll())).append('\n');
                        minusNumbers.remove(peek);
                    }
                    else {
                        result.append(queue.poll()).append('\n');
                    }
                }
            }
            else {
                if (input < 0) {
                    queue.add(-input);
                    minusNumbers.add(input);
                }
                else {
                    queue.add(input);
                }
            }
        }
        System.out.println(result);
    }
}
