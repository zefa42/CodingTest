package BaekJoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Number_10820 {
    static StringBuilder result = new StringBuilder();

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        while(true) {
            String input = bufferedReader.readLine();
            if(input == null || input.isBlank()) break;
            filter(input);
        }
        System.out.println(result);
    }

    public static void filter(String input) {
        int lowerCaseCount = 0;
        int upperCaseCount = 0;
        int digitCaseCount = 0;
        int spaceCaseCount = 0;

        for(int i = 0; i < input.length(); ++i) {
            if(Character.isLowerCase(input.charAt(i))) lowerCaseCount++;
            if(Character.isUpperCase(input.charAt(i))) upperCaseCount++;
            if(Character.isDigit(input.charAt(i))) digitCaseCount++;
            if(Character.isSpaceChar(input.charAt(i))) spaceCaseCount++;
        }
        result.append(lowerCaseCount).append(" ")
                .append(upperCaseCount).append(" ")
                .append(digitCaseCount).append(" ")
                .append(spaceCaseCount).append('\n');
    }
}
