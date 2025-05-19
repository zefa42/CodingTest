import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Number_10824 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String[] input = bufferedReader.readLine().split(" ");
        String aPlusB = input[0] + input[1];
        String cPlusD = input[2] + input[3];
        System.out.println(Long.parseLong(aPlusB) + Long.parseLong(cPlusD));

    }
}
