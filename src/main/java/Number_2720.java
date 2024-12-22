import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Number_2720 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        List<String> result = calculate(Integer.parseInt(bufferedReader.readLine()), bufferedReader);
        for(String exchange : result) {
            System.out.println(exchange);
        }
    }

    private static List<String> calculate(int testCase, BufferedReader bufferedReader) throws IOException {
        List<String> result = new ArrayList<>();

        int quarter = 2500;
        int dime = 1000;
        int nickel = 500;
        int penny = 100;

        for(int i = 0; i < testCase; ++i) {
            StringBuilder stringBuilder = new StringBuilder();
            int price = Integer.parseInt(bufferedReader.readLine()) * 100;
            while (price > 0) {
                stringBuilder.append(price / quarter).append(" ");
                price = price % quarter;
                stringBuilder.append(price / dime).append(" ");
                price = price % dime;
                stringBuilder.append(price / nickel).append(" ");
                price = price % nickel;
                stringBuilder.append(price / penny);
                price = price % penny;
            }
            result.add(stringBuilder.toString());
        }
        return result;
    }
}
