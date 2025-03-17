import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Number_4880 {
    private static final String END_POINT = "0 0 0";
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String input;
        StringBuilder result = new StringBuilder();

        while(!(input = bufferedReader.readLine()).equals(END_POINT)) {
            int[] numbers = Arrays.stream(input.split(" "))
                    .mapToInt(Integer::parseInt)
                    .toArray();
            int first = numbers[0];
            int second = numbers[1];
            int third = numbers[2];

            if((second - first) == (third - second)) {
                result.append("AP ").append(third + (third - second)).append('\n');
            }
            else {
                result.append("GP ").append(third * (third / second)).append('\n');
            }
        }
        System.out.println(result);
    }
}
