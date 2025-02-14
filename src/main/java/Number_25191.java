import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Number_25191 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int chicken = Integer.parseInt(bufferedReader.readLine());
        int[] input = Arrays.stream(bufferedReader.readLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();
        int coke = input[0];
        int beer = input[1];

        int result = (coke / 2) + beer;
        result = Math.min(result, chicken);
        System.out.println(result);
    }
}
