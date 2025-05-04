import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

public class Number_2774 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int count = Integer.parseInt(bufferedReader.readLine());
        StringBuilder result = new StringBuilder();
        for(int i = 0; i < count; ++i) {
            Set<Character> numbers = new HashSet<>();
            String input = bufferedReader.readLine();
            for(int j = 0; j < input.length(); ++j) {
                numbers.add(input.charAt(j));
            }
            result.append(numbers.size()).append('\n');
        }
        System.out.println(result);
    }
}
