import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class Number_2338 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BigInteger A = new BigInteger(bufferedReader.readLine());
        BigInteger B = new BigInteger(bufferedReader.readLine());

        BigInteger first = A.add(B);
        BigInteger second = A.subtract(B);
        BigInteger third = A.multiply(B);

        System.out.println(first);
        System.out.println(second);
        System.out.println(third);
    }
}
