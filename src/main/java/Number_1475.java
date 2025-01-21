import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Number_1475 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        Map<Integer, Integer> numbers = new HashMap<>();

        int[] rawNumbers = Arrays.stream(bufferedReader.readLine().split(""))
                .mapToInt(Integer::parseInt)
                .toArray();

        for (int rawNumber : rawNumbers) {
            numbers.put(rawNumber, numbers.getOrDefault(rawNumber, 0) + 1);
        }

        int six = numbers.getOrDefault(6, 0);
        int nine = numbers.getOrDefault(9, 0);
        int sixNineSum = six + nine;

        int combined = (sixNineSum + 1) / 2;

        numbers.put(6, combined);
        numbers.put(9, 0);

        int max = 0;
        for (int digit : numbers.keySet()) {
            int count = numbers.get(digit);
            if (count > max) {
                max = count;
            }
        }

        System.out.println(max);
    }
}
