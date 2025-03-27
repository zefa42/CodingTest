import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.TreeSet;

public class Number_10867 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int count = Integer.parseInt(bufferedReader.readLine());
        int[] input = Arrays.stream(bufferedReader.readLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();
        StringBuilder result = new StringBuilder();

        int[] sortedArray = sortAscending(count, input);
        for (int j : sortedArray) {
            result.append(j).append(" ");
        }
        System.out.println(result);
    }

    private static int[] sortAscending(int count, int[] input) {
        TreeSet<Integer> sortedInput = new TreeSet<>();
        for(int i = 0; i < count; ++i) {
            sortedInput.add(input[i]);
        }
        int[] sortedArray = new int[sortedInput.size()];
        int i = 0;
        for(Integer number : sortedInput) {
            sortedArray[i++] = number;
        }
        return sortedArray;
    }
}
