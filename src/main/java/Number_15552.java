import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Number_15552 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int count = Integer.parseInt(bufferedReader.readLine());
        StringBuilder result = new StringBuilder();
        for(int i = 0; i < count; ++i) {
            int[] number = new int[2];
            String[] numberString = bufferedReader.readLine().split(" ");
            number[0] = Integer.parseInt(numberString[0]);
            number[1] = Integer.parseInt(numberString[1]);
            result.append(number[0] + number[1]).append('\n');
        }
        System.out.println(result);
    }
}
