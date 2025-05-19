import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Number_32342 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int count = Integer.parseInt(bufferedReader.readLine());
        StringBuilder result = new StringBuilder();
        for(int i = 0; i < count; ++i) {
            String input = bufferedReader.readLine();
            int answer = 0;
            for(int j = 0; j < input.length() - 2; ++j) {
                if(input.startsWith("WOW", j)) {
                    answer++;
                }
            }
            result.append(answer).append('\n');
        }
        System.out.println(result);
    }
}
