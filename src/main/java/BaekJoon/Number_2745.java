import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Number_2745 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println(calculate(bufferedReader));
    }

    private static long calculate(BufferedReader bufferedReader) throws IOException {
        String[] input = bufferedReader.readLine().split(" ");
        String alphabet = input[0];
        long number = Integer.parseInt(input[1]);
        validateNumberRange(number);
        long sum = 0;
        for(int i = 0; i < alphabet.length(); ++i) {
            if(Character.isUpperCase(alphabet.charAt(i))) {
                sum += (alphabet.charAt(i) - 55) * (long)Math.pow(number, alphabet.length() - 1 - i);
            }
            else {
                sum += (alphabet.charAt(i) - '0') * (long)Math.pow(number, alphabet.length() - 1 - i);
            }
        }
        return sum;
    }

    private static void validateNumberRange(long number) {
        if(number > 36 || number < 2) {
            throw new IllegalArgumentException();
        }
    }
}
