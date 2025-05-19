import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Number_27866 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String string = bufferedReader.readLine();
        int sequence = Integer.parseInt(bufferedReader.readLine());
        System.out.println(string.charAt(sequence - 1));
    }
}
