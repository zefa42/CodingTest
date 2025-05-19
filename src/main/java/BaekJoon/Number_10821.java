import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Number_10821 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String[] input = bufferedReader.readLine().split(",");
        System.out.println(input.length);
    }
}
