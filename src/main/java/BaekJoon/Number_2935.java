import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class Number_2935 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BigInteger first = new BigInteger(bufferedReader.readLine());
        String sign = bufferedReader.readLine();
        BigInteger second = new BigInteger(bufferedReader.readLine());

        if(sign.equals("+")) {
            System.out.println(first.add(second));
        }
        else if(sign.equals("*")){
            System.out.println(first.multiply(second));
        }
    }
}
