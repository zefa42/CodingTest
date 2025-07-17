package BaekJoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Number_15964 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        long[] input = Arrays.stream(bufferedReader.readLine().split(" "))
                .mapToLong(Long::parseLong)
                .toArray();

        long first = input[0] + input[1];
        long second = input[0] - input[1];
        long result = first * second;
        System.out.println(result);
    }
}
