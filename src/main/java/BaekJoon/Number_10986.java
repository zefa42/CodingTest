import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Number_10986 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String[] inputNM = bufferedReader.readLine().split(" ");
        int N = Integer.parseInt(inputNM[0]);
        int M = Integer.parseInt(inputNM[1]);

        String[] rawNumbers = bufferedReader.readLine().split(" ");
        long[] count = new long[M];

        long prefixSum = 0;
        long result = 0;

        count[0] = 1;

        for(int i = 0; i < N; ++i) {
              prefixSum += Integer.parseInt(rawNumbers[i]);
              prefixSum %= M;

              result += count[(int)prefixSum];
              count[(int)prefixSum]++;
        }

        System.out.println(result);
    }
}
