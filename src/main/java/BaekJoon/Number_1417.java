import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.PriorityQueue;

public class Number_1417 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int count = Integer.parseInt(bufferedReader.readLine());
        if(count == 1) {
            System.out.println("0");
            return;
        }

        int standard = Integer.parseInt(bufferedReader.readLine());
        PriorityQueue<Integer> candidates = new PriorityQueue<>(Collections.reverseOrder());
        for(int i = 0; i < count - 1; ++i) {
            candidates.add(Integer.parseInt(bufferedReader.readLine()));
        }

        int minPerson = 0;
        while (!candidates.isEmpty() && candidates.peek() >= standard) {
            minPerson++;
            standard++;
            candidates.add(candidates.poll() - 1);
        }
        System.out.println(minPerson);
    }
}
