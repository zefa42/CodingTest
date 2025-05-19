import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Number_11966 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        long number = Long.parseLong(bufferedReader.readLine());
        if(number == 1 || isValid(number)) {
            System.out.println(1);
        }
        else {
            System.out.println(0);
        }
    }

    private static boolean isValid(long number) {
        boolean result = false;
        int pow = 1;
        while((long)Math.pow(2, pow) <= number) {
            if((long)Math.pow(2, pow) == number) {
                result = true;
                break;
            }
            pow++;
        }
        return result;
    }
}
