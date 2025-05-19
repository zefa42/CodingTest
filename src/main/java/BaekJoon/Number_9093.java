import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Number_9093 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int count = Integer.parseInt(bufferedReader.readLine());
        StringBuilder result = new StringBuilder();

        for(int i = 0; i < count; ++i) {
            String[] input = bufferedReader.readLine().split(" ");
            for (String s : input) {
                result.append(getReversedString(s)).append(" ");
            }
            result.append('\n');
        }

        System.out.println(result);
    }

    private static String getReversedString(String input) {
        StringBuilder reveredString = new StringBuilder();
        for(int i = input.length() - 1; i >= 0; --i) {
            reveredString.append(input.charAt(i));
        }
        return reveredString.toString();
    }
}
