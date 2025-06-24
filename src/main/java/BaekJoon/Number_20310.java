package BaekJoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Number_20310 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String input = bufferedReader.readLine();
        int zeroCount = zeroCount(input);
        int oneCount = oneCount(input);

        int resultZero = zeroCount / 2;
        int resultOne = oneCount / 2;

        String result = "0".repeat(Math.max(0, resultZero)) +
                "1".repeat(Math.max(0, resultOne));
        System.out.println(result);
    }

    public static int zeroCount(String input) {
        int count = 0;
        for(int i = 0; i < input.length(); ++i) {
            if(input.charAt(i) == '0') {
                count++;
            }
        }
        return count;
    }

    public static int oneCount(String input) {
        int count = 0;
        for(int i = 0; i < input.length(); ++i) {
            if(input.charAt(i) == '1') {
                count++;
            }
        }
        return count;
    }
}
