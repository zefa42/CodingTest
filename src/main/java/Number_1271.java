import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class Number_1271 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String[] input = bufferedReader.readLine().split(" ");
        BigInteger money = new BigInteger(input[0]);
        BigInteger divide = new BigInteger(input[1]);
        System.out.println(money.divide(divide));
        System.out.println(money.mod(divide));
    }
}
