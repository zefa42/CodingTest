import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Number_2075 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        long startTime = System.currentTimeMillis();
        int count = Integer.parseInt(bufferedReader.readLine());
        List<Integer> n = new ArrayList<>();
        for(int i = 0; i < count; ++i) {
            int[] numbers = Arrays.stream(bufferedReader.readLine().split(" "))
                    .mapToInt(Integer::parseInt)
                    .toArray();
            for(int j = 0; j < count; ++j) {
                n.add(numbers[j]);
            }
        }
        n.sort(Collections.reverseOrder());
        System.out.println(n.get(count - 1));
        long endTime = System.currentTimeMillis();
        System.out.println(endTime - startTime);
    }
}
