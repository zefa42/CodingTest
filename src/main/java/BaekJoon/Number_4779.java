import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Number_4779 {
    static char[] input;

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder result = new StringBuilder();
        String string;
        while((string = bufferedReader.readLine()) != null && !string.isBlank()) {
            int number = Integer.parseInt(string);
            int size = (int) Math.pow(3, number);
            input = new char[size];
            Arrays.fill(input, '-');
            recur(0, size);
            result.append(input).append('\n');
            Arrays.fill(input, '-');
        }

        System.out.println(result);
    }

    private static void recur(int start, int end) {
        if(end - start < 3) {
            return;
        }
        int partition = (end - start) / 3;

        // 중간 구간 공백 채움
        Arrays.fill(input, start + partition, start + 2 * partition, ' ');

        // 좌측 구간 작업
        recur(start, start + partition);

        // 우측 구간 작업
        recur(start + 2 * partition, end);
    }
}
