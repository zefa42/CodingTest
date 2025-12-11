package BaekJoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Number_14656 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int result = 0;

        int count = Integer.parseInt(bufferedReader.readLine());
        int[] sequence = Arrays.stream(bufferedReader.readLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();
        for(int i = 0; i < count; ++i) {
            if(sequence[i] != i + 1) result++;
        }

        System.out.println(result);
    }
}
