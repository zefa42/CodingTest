import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Number_11721 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String input = bufferedReader.readLine();
        StringBuilder result = new StringBuilder();

        while(input.length() > 10) {
            result.append(input.substring(0, 10)).append('\n');
            input = input.substring(10);
        }
        result.append(input.substring(0, input.length())).append('\n');

        System.out.println(result);
    }
}
