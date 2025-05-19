import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Number_10798 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        printResult(readLetters(bufferedReader));
    }

    private static String[][] readLetters(BufferedReader bufferedReader) throws IOException {
        String[][] letters = new String[5][15];
        for(int i = 0; i < 5; ++i) {
            String line = bufferedReader.readLine();
            for(int j = 0; j < line.length(); ++j) {
                letters[i][j] = String.valueOf(line.charAt(j));
            }
        }
        return letters;
    }

    private static void printResult(String[][] letters) {
        StringBuilder stringBuilder = new StringBuilder();
        for(int i = 0; i < 15; ++i) {
            for(int j = 0; j < 5; ++j) {
                if(letters[j][i] != null) {
                    stringBuilder.append(letters[j][i]);
                }
            }
        }
        System.out.println(stringBuilder);
    }
}
