import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Number_11720 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int count = Integer.parseInt(bufferedReader.readLine());
        int sum = 0;
        String[] input = bufferedReader.readLine().split("");
        for(int i = 0; i < count; ++i) {
            sum += Integer.parseInt(input[i]);
        }
        System.out.println(sum);
    }
}
