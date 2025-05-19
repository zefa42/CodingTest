import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Number_25305 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int[] prize = readPrize(bufferedReader);
        List<Integer> score = readScores(bufferedReader);
        System.out.println(score.get(score.size() - prize[1]));
    }

    private static int[] readPrize(BufferedReader bufferedReader) throws IOException {
        return Arrays.stream(bufferedReader.readLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();
    }

    private static List<Integer> readScores(BufferedReader bufferedReader) throws IOException {
        return Arrays.stream(bufferedReader.readLine().split(" "))
                .map(Integer::parseInt)
                .sorted()
                .collect(Collectors.toList());
    }
}
