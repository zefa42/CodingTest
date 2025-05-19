import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Number_2953 {
    private static final int PARTICIPANTS_COUNT = 5;

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        Map<Integer, Integer> scores = new HashMap<>();
        int[] sums = new int[5];
        for(int i = 0; i < PARTICIPANTS_COUNT; ++i) {
            int sum = Arrays.stream(bufferedReader.readLine().split(" "))
                    .mapToInt(Integer::parseInt)
                    .sum();
            scores.put(i, sum);
            sums[i] = sum;
        }
        Arrays.sort(sums);
        String result = "";
        for(Integer key : scores.keySet()) {
            if(sums[4] == scores.get(key)) {
                result = String.valueOf(key + 1);
            }
        }
        result += " " + sums[4];

        System.out.println(result);
    }
}
