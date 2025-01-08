import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Number_10870 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        long number = Long.parseLong(bufferedReader.readLine());
        System.out.println(fibonacci(number));
    }

    private static long fibonacci(long number) {
        if(number == 0) {
            return 0;
        }
        if(number == 1) {
            return 1;
        }
        return fibonacci(number - 1) + fibonacci(number - 2);
    }
}
