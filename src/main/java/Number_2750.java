import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class Number_2750 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        List<Integer> numbers = new ArrayList<>();
        int count = Integer.parseInt(bufferedReader.readLine());
        for(int i = 0; i < count; ++i) {
            numbers.add(Integer.parseInt(bufferedReader.readLine()));
        }
        Collections.sort(numbers);
        Set<Integer> sortedNumbers = new LinkedHashSet<>(numbers);
        for(Integer number : sortedNumbers) {
            System.out.println(number);
        }
    }
}
