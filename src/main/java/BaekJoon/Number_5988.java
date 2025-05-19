import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class Number_5988 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int count = Integer.parseInt(bufferedReader.readLine());
        StringBuilder result = new StringBuilder();
        for(int i = 0; i < count; ++i) {
            BigInteger input = new BigInteger(bufferedReader.readLine());
            if(input.remainder(BigInteger.valueOf(2)).equals(BigInteger.ZERO)) {
                result.append("even").append('\n');
            }
            else {
                result.append("odd").append('\n');
            }
        }
        System.out.println(result);
    }
}
