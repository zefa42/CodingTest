import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Number_5717 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String input;
        StringBuilder result = new StringBuilder();
        while(!(input = bufferedReader.readLine()).equals("0 0")) {
            result.append(Integer.parseInt(input.split(" ")[0]) + Integer.parseInt(input.split(" ")[1])).append('\n');
        }
        System.out.println(result);
    }
}
