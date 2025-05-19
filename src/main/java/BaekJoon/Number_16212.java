import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Number_16212 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int count = Integer.parseInt(bufferedReader.readLine());
        int[] input = Arrays.stream(bufferedReader.readLine().split(" "))
                .mapToInt(Integer::parseInt)
                .sorted()
                .toArray();
        
        StringBuilder result = new StringBuilder();
        for(int i = 0; i < count; ++i) {
            result.append(input[i]).append(" ");
        }
        System.out.println(result);
    }
}
