import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Number_16483 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String input = bufferedReader.readLine();
        int[] alphabets = new int[26];
        Arrays.fill(alphabets, -1);

        for(int i = 0; i < input.length(); ++i) {
            int alphabet = input.charAt(i) - 'a';
            if(alphabets[alphabet] == -1) {
                alphabets[alphabet] = i;
            }
        }

        StringBuilder result = new StringBuilder();
        for(int index : alphabets) {
            result.append(index).append(" ");
        }
        System.out.println(result);
    }
}
