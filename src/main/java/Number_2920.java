import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Number_2920 {
    private static final int COUNT = 8;
    private static final int[] ascendingScale = {1, 2, 3, 4, 5, 6, 7, 8};
    private static final int[] descendingScale = {8, 7, 6, 5, 4, 3, 2, 1};

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int[] input = Arrays.stream(bufferedReader.readLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        String result = "mixed";
        if(input[0] == 1) {
            int count = findSameScale(ascendingScale, input);
            if(count == 8) {
                result = "ascending";
            }
        }
        else if(input[0] == 8) {
            int count = findSameScale(descendingScale, input);
            if(count == 8) {
                result = "descending";
            }
        }

        System.out.println(result);
    }

    private static int findSameScale(int[] scale, int[] input) {
        int count = 0;
        for(int i = 0; i < COUNT; ++i) {
            if(scale[i] == input[i]) {
                count++;
            }
        }
        return count;
    }
}
