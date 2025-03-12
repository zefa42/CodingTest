import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Number_8958 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int count = Integer.parseInt(bufferedReader.readLine());
        StringBuilder result = new StringBuilder();

        for(int i = 0; i < count; ++i) {
            String input = bufferedReader.readLine();
            result.append(getScore(input)).append('\n');
        }
        System.out.println(result);
    }

    private static int getScore(String input) {
        int sum = 0;
        String[] splitInput = input.split("X");
        for(int i = 0; i < splitInput.length; ++i) {
            if(splitInput[i] == null) {
                continue;
            }
            int plus = 1;
            for(int j = 0; j < splitInput[i].length(); ++j) {
                sum += plus++;
            }
        }
        return sum;
    }
}
