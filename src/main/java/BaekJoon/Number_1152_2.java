package BaekJoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Number_1152_2 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String[] input = bufferedReader.readLine().split(" ");
        int count = input.length;
        if(input[0].isEmpty()) count--;
        if(input[input.length - 1].isEmpty()) count--;
        System.out.println(count);
    }
}
