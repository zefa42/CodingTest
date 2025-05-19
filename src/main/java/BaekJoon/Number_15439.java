import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Number_15439 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int count = Integer.parseInt(bufferedReader.readLine());
        System.out.println(count *(count-1));
    }
}
