import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Number_10951 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String numbers;
        while((numbers = bufferedReader.readLine()) != null) {
            System.out.println(Integer.parseInt(numbers.split(" ")[0]) + Integer.parseInt(numbers.split(" ")[1]));
        }
    }
}
