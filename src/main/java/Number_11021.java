import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Number_11021 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int count = Integer.parseInt(bufferedReader.readLine());
        StringBuilder result = new StringBuilder();

        for(int i = 0; i < count; ++i) {
            int[] number = new int[2];
            String[] rawNumber = bufferedReader.readLine().split(" ");
            number[0] = Integer.parseInt(rawNumber[0]);
            number[1] = Integer.parseInt(rawNumber[1]);
            result.append("Case #").append(i+1).append(": ").append(number[0]+number[1]).append('\n');
        }
        System.out.println(result);
    }
}
