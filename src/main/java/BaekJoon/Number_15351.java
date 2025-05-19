import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Number_15351 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int count = Integer.parseInt(bufferedReader.readLine());

        StringBuilder result = new StringBuilder();
        for(int i = 0; i < count; ++i) {
            int sum = 0;
            String input = bufferedReader.readLine();
            for(int j = 0; j < input.length(); ++j) {
                if(!Character.isAlphabetic(input.charAt(j))) {
                    continue;
                }
                sum += (input.charAt(j) - 64);
            }
            if(sum == 100) {
                result.append("PERFECT LIFE").append('\n');
            }
            else {
                result.append(sum).append('\n');
            }
        }
        System.out.println(result);
    }
}
