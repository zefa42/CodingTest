package BaekJoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Number_10093 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        long[] input = Arrays.stream(bufferedReader.readLine().split(" "))
                .mapToLong(Long::parseLong)
                .toArray();
        long start = Math.min(input[0], input[1]);
        long end = Math.max(input[0], input[1]);

        StringBuilder result = new StringBuilder();
        long size = end - start - 1;
        result.append(size < 0 ? 0 : size).append('\n');
        for (long i = start + 1; i < end; ++i) {
            result.append(i).append(" ");
        }
        System.out.println(result);
    }
}
