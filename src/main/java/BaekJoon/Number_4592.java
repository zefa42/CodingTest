import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Number_4592 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String input;
        StringBuilder result = new StringBuilder();
        while(!(input = bufferedReader.readLine()).equals("0")) {
            int[] rawInput = Arrays.stream(input.split(" "))
                    .mapToInt(Integer::parseInt)
                    .toArray();

            for(int i = 1; i < rawInput.length; ++i) {
                if(rawInput[i] != rawInput[i - 1]) {
                    result.append(rawInput[i]).append(" ");
                }
            }
            result.append("$").append('\n');
        }
        System.out.println(result);
    }
}
