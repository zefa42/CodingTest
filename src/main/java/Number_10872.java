import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Number_10872 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println(fibonacci(Integer.parseInt(bufferedReader.readLine())));
    }

    private static int fibonacci(int number) {
        if(number == 0) return 1;
        if(number == 1) return 1;
        return number * fibonacci(number - 1);
    }
}
