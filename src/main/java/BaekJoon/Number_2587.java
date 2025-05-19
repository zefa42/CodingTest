import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Number_2587 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        List<Integer> numbers = new ArrayList<>();
        for(int i = 0; i < 5; ++i) {
            numbers.add(Integer.parseInt(bufferedReader.readLine()));
        }
        Collections.sort(numbers);
        int middle = numbers.get(2);
        int sum = 0;
        for(Integer number : numbers) {
            sum += number;
        }
        int average = sum / 5;
        System.out.println(average);
        System.out.println(middle);
    }
}
