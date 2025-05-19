import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Number_4470 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int count = Integer.parseInt(bufferedReader.readLine());
        StringBuilder result = new StringBuilder();
        for(int i = 1; i <= count; ++i) {
            result.append(i).append(". ").append(bufferedReader.readLine()).append('\n');
        }
        System.out.println(result);
    }
}
