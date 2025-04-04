import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Number_15688 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int count = Integer.parseInt(bufferedReader.readLine());
        StringBuilder result = new StringBuilder();
        List<Integer> numbers = new ArrayList<>();
        for(int i = 0; i < count; ++i) {
            int number = Integer.parseInt(bufferedReader.readLine());
            numbers.add(number);
        }
        
        Collections.sort(numbers);
        for(Integer num : numbers) {
            result.append(num).append('\n');
        }
        System.out.println(result);
    }
}
