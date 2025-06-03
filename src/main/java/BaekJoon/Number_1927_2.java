package BaekJoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;

public class Number_1927_2 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int count = Integer.parseInt(bufferedReader.readLine());

        StringBuilder result = new StringBuilder();
        PriorityQueue<Integer> numbers = new PriorityQueue<>();
        for(int i = 0; i < count; ++i) {
            int input = Integer.parseInt(bufferedReader.readLine());
            if(input == 0) {
                if (!numbers.isEmpty()) {
                    result.append(numbers.poll()).append('\n');
                }
                else {
                    result.append("0").append('\n');
                }
            }
            else {
                numbers.add(input);
            }
        }
        System.out.println(result);
    }
}
