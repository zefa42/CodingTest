import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Number_11659 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String[] input = bufferedReader.readLine().split(" ");
        int numberCount = Integer.parseInt(input[0]);
        int calculateCount = Integer.parseInt(input[1]);

        int[] numbers = new int[numberCount];
        int[] sum = new int[numberCount];
        String[] rawNumbers = bufferedReader.readLine().split(" ");
        for(int i = 0; i < numberCount; ++i) {
            numbers[i] = Integer.parseInt(rawNumbers[i]);
            if(i > 0) {
                sum[i] = sum[i - 1] + numbers[i];
            }
            else {
                sum[i] = numbers[i];
            }
        }

        StringBuilder result = new StringBuilder();
        for(int i = 0; i < calculateCount; ++i) {
            String[] calculate = bufferedReader.readLine().split(" ");
            int start = Integer.parseInt(calculate[0]);
            int end = Integer.parseInt(calculate[1]);
            if(start == 1) {
                result.append(sum[end - 1]).append('\n');
            }
            else {
                result.append(sum[end - 1] - sum[start - 2]).append('\n');
            }
        }
        System.out.print(result);
    }
}
