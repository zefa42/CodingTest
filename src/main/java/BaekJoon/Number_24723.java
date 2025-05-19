import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Number_24723 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int count = Integer.parseInt(bufferedReader.readLine());
        System.out.println((int)Math.pow(2,count));
    }
}
