import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Number_25372 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int count = Integer.parseInt(bufferedReader.readLine());
        StringBuilder result = new StringBuilder();
        for(int i = 0; i < count; ++i) {
            String input = bufferedReader.readLine();
            result.append(validateLength(input)).append('\n');
        }
        System.out.println(result);
    }

    private static String validateLength(String input) {
        if(input.length() < 6 || input.length() > 9) {
            return "no";
        }
        return "yes";
    }
}
