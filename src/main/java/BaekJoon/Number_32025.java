import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Number_32025 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int H = Integer.parseInt(bufferedReader.readLine());
        int W = Integer.parseInt(bufferedReader.readLine());
        System.out.println(Math.min(H, W) * 50);
    }
}
