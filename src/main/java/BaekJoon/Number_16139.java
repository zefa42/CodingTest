import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Number_16139 {
    static final int ALPHABET_SIZE = 26;
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String string = bufferedReader.readLine();

        int stringSize = string.length();
        int[][] prefix = new int[ALPHABET_SIZE][stringSize + 1];

        for(int i = 0; i < stringSize; ++i) {
            char alphabet = string.charAt(i);
            int alphabetIndex = alphabet - 'a';

            for(int c = 0; c < ALPHABET_SIZE; ++c) {
                prefix[c][i + 1] = prefix[c][i];
            }
            prefix[alphabetIndex][i + 1]++;
        }

        int count = Integer.parseInt(bufferedReader.readLine());
        StringBuilder result = new StringBuilder();

        for(int i = 0; i < count; ++i) {
            String[] input = bufferedReader.readLine().split(" ");
            char inputAlphabet = input[0].charAt(0);
            int start = Integer.parseInt(input[1]);
            int end = Integer.parseInt(input[2]);

            int inputAlphabetIndex = inputAlphabet - 'a';
            int sum = prefix[inputAlphabetIndex][end + 1] - prefix[inputAlphabetIndex][start];
            result.append(sum).append('\n');
        }
        System.out.println(result);
    }
}
