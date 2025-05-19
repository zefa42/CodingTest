import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Number_2920 {
    private static final int[] ascendingScale = {1, 2, 3, 4, 5, 6, 7, 8};
    private static final int[] descendingScale = {8, 7, 6, 5, 4, 3, 2, 1};

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int[] input = Arrays.stream(bufferedReader.readLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        String result = "mixed";
        if(Arrays.equals(ascendingScale, input)) {
            result = "ascending";
        }
        else if(Arrays.equals(descendingScale, input)) {
            result = "descending";
        }

        System.out.println(result);
    }
}
