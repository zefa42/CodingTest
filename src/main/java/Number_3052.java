import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

public class Number_3052 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        Set<Integer> rest = new HashSet<>();
        for(int i = 0; i < 10; ++i) {
            int number = Integer.parseInt(bufferedReader.readLine());
            rest.add(number % 42);
        }
        System.out.println(rest.size());
    }
}
