import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Number_2559 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String[] input = bufferedReader.readLine().split(" ");
        int numberCount = Integer.parseInt(input[0]);
        int dayCount = Integer.parseInt(input[1]);

        int[] numbers = new int[numberCount];
        int[] daySum = new int[numberCount - dayCount + 1];

        int[] numberSum = new int[numberCount + 1];

        String[] inputNumbers = bufferedReader.readLine().split(" ");
        for(int i = 0; i < numberCount; ++i) {
            numbers[i] = Integer.parseInt(inputNumbers[i]);
            numberSum[i + 1] = numberSum[i] + numbers[i];
        }

        int max = Integer.MIN_VALUE;
        for(int i = 0; i < daySum.length; ++i) {
            daySum[i] = numberSum[i + dayCount] - numberSum[i];
            if(max < daySum[i]) {
                max = daySum[i];
            }
        }
        System.out.println(max);
    }
}
