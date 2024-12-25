import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Number_14215 {
    public static void main(String[] args) throws IOException {
        System.out.println(calculate(readSticks()));
    }

    private static int[] readSticks() throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        return Arrays.stream(bufferedReader.readLine().split(" "))
                .mapToInt(Integer::parseInt)
                .sorted()
                .toArray();
    }

    private static int calculate(int[] sticks) {
        int max = sticks[2];
        while(max >= sticks[0] + sticks[1]) {
            max--;
        }
        return sticks[0] + sticks[1] + max;
    }
}
