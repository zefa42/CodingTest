package BaekJoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;

public class Number_11931 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int count = Integer.parseInt(bufferedReader.readLine());
        Integer[] arr = new Integer[count];
        for(int i = 0; i < count; ++i) {
            arr[i] = Integer.parseInt(bufferedReader.readLine());
        }
        Arrays.sort(arr, Comparator.reverseOrder());

        StringBuilder result = new StringBuilder();
        for(int number : arr) {
            result.append(number).append('\n');
        }
        System.out.println(result);
    }
}
