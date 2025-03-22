import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Number_5524 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int count = Integer.parseInt(bufferedReader.readLine());
        StringBuilder result = new StringBuilder();
        for(int i = 0; i < count; ++i) {
            result.append(convertLowerAlphabet(bufferedReader.readLine())).append('\n');
        }
        System.out.println(result);
    }

    private static String convertLowerAlphabet(String input) {
        StringBuilder string = new StringBuilder();
        for(int i = 0; i < input.length(); ++i) {
            string.append(Character.toLowerCase(input.charAt(i)));
        }
        return string.toString();
    }
}
