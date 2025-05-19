import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Number_31403 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String A = bufferedReader.readLine();
        String B = bufferedReader.readLine();
        String C = bufferedReader.readLine();
        System.out.println(Integer.parseInt(A) + Integer.parseInt(B) - Integer.parseInt(C));
        System.out.println(Integer.parseInt(A + B) - Integer.parseInt(C));

    }
}
