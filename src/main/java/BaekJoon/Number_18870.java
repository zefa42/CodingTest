import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Number_18870 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int count = Integer.parseInt(bufferedReader.readLine());
        String[] inputNumbers = bufferedReader.readLine().split(" ");
        int[] rawNumbers = new int[count];
        for(int i = 0; i < count; ++i) {
            rawNumbers[i] = Integer.parseInt(inputNumbers[i]);
        }
        int[] sortedNumbers = rawNumbers.clone();
        Arrays.sort(sortedNumbers);

        Map<Integer, Integer> numbers = new HashMap<>();
        int index = 0;
        for(int number : sortedNumbers) {
            if(!numbers.containsKey(number)) {
                numbers.put(number, index++);
            }
        }

        StringBuilder result = new StringBuilder();
        for(int number : rawNumbers) {
            result.append(numbers.get(number)).append(" ");
        }
        System.out.println(result);
    }
}
