import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Number_1085 {
    public static void main(String[] args) throws IOException {
        System.out.println(calculate(readNumbers()));
    }

    private static int[] readNumbers() throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        return Arrays.stream(bufferedReader.readLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();
    }

    private static int calculate(int[] numbers) {
        int x = numbers[0];
        int y = numbers[1];
        int w = numbers[2];
        int h = numbers[3];
        int result = x;
        if(result > w - x) {
            result = w - x;
        }
        if(result > y) {
            result = y;
        }
        if(result > h - y) {
            result = h - y;
        }
        return result;
    }
}
