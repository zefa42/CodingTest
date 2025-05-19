import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Number_27110 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int chickenMaxCount = Integer.parseInt(bufferedReader.readLine());
        int[] chickensCount = Arrays.stream(bufferedReader.readLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        int result = 0;
        for (int chicken : chickensCount) {
            result += Math.min(chickenMaxCount, chicken);
        }

        System.out.println(result);
    }
}
