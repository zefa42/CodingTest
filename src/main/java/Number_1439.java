import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Number_1439 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String input = bufferedReader.readLine();

        int result = 0;
        for(int i = 0; i < input.length() - 1; ++i) {
            if(input.charAt(i) != input.charAt(i + 1)) {
                result++;
            }
        }
        if(result == 0) {
            System.out.println(result);
        }
        else {
            System.out.println((result+1) / 2);
        }
    }
}
