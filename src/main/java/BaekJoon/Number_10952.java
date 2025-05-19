import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Number_10952 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int sum;
        String input = bufferedReader.readLine();
        sum = Integer.parseInt(input.split(" ")[0]) + Integer.parseInt(input.split(" ")[1]);
        StringBuilder result = new StringBuilder();
        result.append(sum).append('\n');
        while(true) {
            input = bufferedReader.readLine();
            if(input.equals("0 0")) {
                break;
            }
            sum = Integer.parseInt(input.split(" ")[0]) + Integer.parseInt(input.split(" ")[1]);
            result.append(sum).append('\n');
        }
        System.out.println(result);
    }
}
