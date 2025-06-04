package BaekJoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;

public class Number_11286_2 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int count = Integer.parseInt(bufferedReader.readLine());
        PriorityQueue<Integer> queue = new PriorityQueue<>((a,b) -> {
            if(Math.abs(a) == Math.abs(b)) {
                return a - b;
            }
            return Math.abs(a) - Math.abs(b);
        });

        StringBuilder result = new StringBuilder();
        for(int i = 0; i < count; ++i) {
            int number = Integer.parseInt(bufferedReader.readLine());
            if(number == 0) {
                if(queue.isEmpty()) {
                    result.append(0).append('\n');
                } else {
                    result.append(queue.poll()).append('\n');
                }
            } else {
                queue.add(number);
            }
        }
        System.out.println(result);
    }
}
