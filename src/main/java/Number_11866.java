import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class Number_11866 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String[] input = bufferedReader.readLine().split(" ");
        int size = Integer.parseInt(input[0]);
        int k = Integer.parseInt(input[1]);

        Queue<Integer> sequence = new LinkedList<>();
        for(int i = 0; i < size; ++i) {
            sequence.add(i + 1);
        }

        StringBuilder result = new StringBuilder();
        result.append("<");

        while(!sequence.isEmpty()) {
            for(int i = 0; i < k - 1; ++i) {
                sequence.add(sequence.poll());
            }
            result.append(sequence.poll());
            if(!sequence.isEmpty()) {
                result.append(", ");
            }
        }
        result.append(">");
        System.out.println(result);
    }

}
