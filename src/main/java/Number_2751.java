import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Number_2751 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int count = Integer.parseInt(bufferedReader.readLine());
        List<Integer> numbers = new ArrayList<>();
        for(int i = 0; i < count; ++i) {
            numbers.add(readNumber(bufferedReader));
        }
        Collections.sort(numbers);
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
