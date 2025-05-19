import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Number_1072 {
    private static final long RANGE_MAX = 1_000_000_000;

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        long[] input = Arrays.stream(bufferedReader.readLine().split(" "))
                .mapToLong(Long::parseLong)
                .toArray();
        long X = input[0];
        long Y = input[1];
        long Z = Y * 100 / X;

        if(Z >= 99) {
            System.out.println("-1");
            return;
        }

        long left = 1;
        long right = RANGE_MAX;
        long result = -1;
        while(left <= right) {
            long mid = (left + right) / 2;
            long newZ = ((Y + mid) * 100) / (X + mid);

            if(newZ > Z) {
                result = mid;
                right = mid - 1;
            }
            else {
                left = mid + 1;
            }
        }
        System.out.println(result);
    }
}