import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Number_2501 {
    public static void main(String[] args) throws IOException {
        System.out.println(findFactor(readNumbers()));
    }

    private static int[] readNumbers() throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        return Arrays.stream(bufferedReader.readLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();
    }

    private static int findFactor(int[] numbers) {
        int number = numbers[0];
        int sequence = numbers[1];
        List<Integer> factors = new ArrayList<>();
        for(int i = 1; i <= number; ++i) {
            if(number % i == 0) {
                factors.add(i);
            }
        }
        if(sequence > factors.size()) {
            return 0;
        }
        return factors.get(sequence - 1);
    }
}
