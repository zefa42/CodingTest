import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Number_2576 {
    private static final int NUMBER_COUNT = 7;
    private static final int MAX_NUMBER = 100;
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int sum = 0;
        int minNumber = MAX_NUMBER;
        for(int i = 0; i < NUMBER_COUNT; ++i) {
            int number = Integer.parseInt(bufferedReader.readLine());
            validateNumberRange(number);

            if(number % 2 != 0) {
                sum += number;
                if(number < minNumber) {
                    minNumber = number;
                }
            }
        }

        if(sum != 0) {
            System.out.println(sum);
            System.out.println(minNumber);
        }
        else {
            System.out.println("-1");
        }
    }

    private static void validateNumberRange(int number) {
        if(number < 1 || number > MAX_NUMBER) {
            throw new IllegalArgumentException();
        }
    }
}
