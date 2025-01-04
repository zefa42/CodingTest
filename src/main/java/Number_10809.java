import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Number_10809 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int count = Integer.parseInt(bufferedReader.readLine());
        StringBuilder result = new StringBuilder();
        for(int i = 0; i < count; ++i) {
            String[] input = bufferedReader.readLine().split(" ");
            int loop = Integer.parseInt(input[0]);
            String string = input[1];
            StringBuilder newString = new StringBuilder();
            for(int j = 0; j < string.length(); ++j) {
                for(int k = 0; k < loop; ++k) {
                    newString.append(string.charAt(j));
                }
            }
             result.append(newString).append('\n');
        }
        System.out.println(result);
    }
}
