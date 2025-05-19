import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Number_4101 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder result = new StringBuilder();

        while(true) {
            String input = bufferedReader.readLine();
            if(input.equals("0 0")) {
                break;
            }
            int[] numbers = Arrays.stream(input.split(" "))
                    .mapToInt(Integer::parseInt)
                    .toArray();
            if(numbers[0] > numbers[1]) {
                result.append("Yes").append('\n');
            }
            else {
                result.append("No").append('\n');
            }
        }

        System.out.println(result);
    }
}
