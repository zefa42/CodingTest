import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Number_10823 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String input;
        StringBuilder string = new StringBuilder();
        while((input = bufferedReader.readLine()) != null) {
            string.append(input);
        }
        int[] rawResult = Arrays.stream(string.toString().split(","))
                .mapToInt(Integer::parseInt)
                .toArray();
        int sum = Arrays.stream(rawResult).sum();
        System.out.println(sum);
    }
}
