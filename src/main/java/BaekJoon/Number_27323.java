import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Number_27323 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int x = Integer.parseInt(bufferedReader.readLine());
        int y = Integer.parseInt(bufferedReader.readLine());
        System.out.println(x * y);
    }
}
