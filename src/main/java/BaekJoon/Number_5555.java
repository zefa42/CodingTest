package BaekJoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Number_5555 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String str = bufferedReader.readLine();
        int testCount = Integer.parseInt(bufferedReader.readLine());
        int count = 0;
        for(int i = 0; i < testCount; ++i) {
            String testCase = convert(bufferedReader.readLine());
            if(testCase.contains(str)) {
                count++;
            }
        }
        System.out.println(count);
    }

    public static String convert(String input) {
        return input.concat(input + input);
    }
}
