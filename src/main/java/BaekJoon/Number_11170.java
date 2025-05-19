import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Number_11170 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int count = Integer.parseInt(bufferedReader.readLine());
        StringBuilder result = new StringBuilder();
        for(int i = 0; i < count; ++i) {
            int zero = 0;
            int[] input = Arrays.stream(bufferedReader.readLine().split(" "))
                    .mapToInt(Integer::parseInt)
                    .toArray();
            int start = input[0];
            int end = input[1];
            for(int j = start; j <= end; ++j) {
                if(j == 0) {
                    zero++;
                } else {
                    int tmp = j;
                    while(tmp > 0) {
                        if(tmp % 10 == 0) {
                            zero++;
                        }
                        tmp /= 10;
                    }
                }
            }
            result.append(zero).append('\n');
        }
        System.out.println(result);
    }
}
