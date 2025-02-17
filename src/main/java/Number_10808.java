import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Number_10808 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String input = bufferedReader.readLine();

        int[] alphabets = new int[26];
        for(int i = 0; i < input.length(); ++i) {
            alphabets[input.charAt(i) - 'a']++;
        }

        StringBuilder result = new StringBuilder();
        for(int alphabet : alphabets) {
            result.append(alphabet).append(" ");
        }
        System.out.println(result);
    }
}
