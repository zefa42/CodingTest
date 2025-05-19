import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Number_10989 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int count = Integer.parseInt(bufferedReader.readLine());
        int[] numbers = new int[count];
        for(int i = 0; i < count; ++i) {
            numbers[i] = readNumber(bufferedReader);
        }
        Arrays.sort(numbers);
        StringBuilder result = new StringBuilder();
        for(Integer number : numbers) {
            result.append(number).append('\n');
        }
        System.out.println(result);
    }

    private static int readNumber(BufferedReader bufferedReader) throws IOException {
        return Integer.parseInt(bufferedReader.readLine());
    }
}
