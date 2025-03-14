import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Number_1748 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int number = Integer.parseInt(bufferedReader.readLine());
        System.out.println(getNumberLength(number));
    }

    private static long getNumberLength(long number) {
        long totalDigits = 0;
        long digit = 1;
        long start = 1;
        while(start * 10 <= number) {
            long end = start * 10 -1;
            totalDigits += digit * (end - start + 1);
            digit++;
            start *= 10;
        }
        // start ~ number countSum
        totalDigits += digit * (number - start + 1);
        return totalDigits;
    }


}
