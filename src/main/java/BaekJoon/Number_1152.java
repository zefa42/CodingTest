import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Number_1152 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String[] input = bufferedReader.readLine().trim().split(" ");
        if(input[0] == null || input[0].isBlank()) {
            System.out.println(0);
        }
        else {
            System.out.println(input.length);
        }
    }
}
