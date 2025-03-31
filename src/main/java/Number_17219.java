import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Number_17219 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int[] count = Arrays.stream(bufferedReader.readLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();
        int savedWebCount = count[0];
        int findPasswordCount = count[1];

        Map<String, String> sitePassword = new HashMap<>();
        StringBuilder result = new StringBuilder();
        for(int i = 0; i < savedWebCount; ++i) {
            String[] input = bufferedReader.readLine().split(" ");
            sitePassword.put(input[0], input[1]);
        }

        for(int i = 0; i < findPasswordCount; ++i) {
            String input = bufferedReader.readLine();
            result.append(sitePassword.get(input)).append('\n');
        }

        System.out.println(result);
    }
}
