import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Number_15894 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        long count = Long.parseLong(bufferedReader.readLine());
        System.out.println(count * 4);
    }
}
