import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Number_11728 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int[] sizes = Arrays.stream(bufferedReader.readLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();
        int firstSize = sizes[0];
        int secondSize = sizes[1];

        int[] first = Arrays.stream(bufferedReader.readLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        int[] second = Arrays.stream(bufferedReader.readLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        int[] result = new int[firstSize + secondSize];

        for(int i = 0; i < firstSize; ++i) {
            result[i] = first[i];
        }

        int tmpFirstSize = firstSize;
        for(int i = 0; i < secondSize; ++i) {
            result[tmpFirstSize++] = second[i];
        }

        StringBuilder answer = new StringBuilder();
        Arrays.sort(result);
        for(int number : result) {
            answer.append(number).append(" ");
        }
        System.out.println(answer);
    }
}
