import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class Number_13227 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String[] input = bufferedReader.readLine().split(" ");
        BigInteger first = new BigInteger(input[0]);
        BigInteger second = new BigInteger(input[1]);
        BigInteger result = first.multiply(second);
        System.out.println(result);
    }
}
