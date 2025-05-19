import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Number_10871 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String[] input = bufferedReader.readLine().split(" ");
        //int count = Integer.parseInt(input[0]);
        int standard = Integer.parseInt(input[1]);
        //int[] numbers = new int[count];
        String[] inputNumbers = bufferedReader.readLine().split(" ");
        StringBuilder result = new StringBuilder();

        for (String inputNumber : inputNumbers) {
            if (Integer.parseInt(inputNumber) < standard) {
                result.append(Integer.parseInt(inputNumber)).append(" ");
            }
        }

        System.out.println(result);
    }
}
