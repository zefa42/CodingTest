import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Number_27433 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        long number = Integer.parseInt(bufferedReader.readLine());
        System.out.println(factorial(number));
    }

    private static long factorial(long number) {
        if(number == 0 || number == 1) {
            return 1;
        }
        return number * factorial(number - 1);
    }
}