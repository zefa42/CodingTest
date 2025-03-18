import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.DecimalFormat;

public class Number_10179 {
    private static final int DISCOUNT_PERCENTAGE = 20;

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int count = Integer.parseInt(bufferedReader.readLine());
        StringBuilder result = new StringBuilder();

        for(int i = 0; i < count; ++i) {
            double input = Double.parseDouble(bufferedReader.readLine());
            DecimalFormat price = new DecimalFormat("0.00");
            result.append("$").append(price.format(input * (100 - DISCOUNT_PERCENTAGE) / 100)).append('\n');
        }

        System.out.println(result);
    }
}
