import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Number_25304 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        printResult(isCorrectReceipt(bufferedReader));
    }

    private static Boolean isCorrectReceipt(BufferedReader bufferedReader) throws IOException {
        int money = Integer.parseInt(bufferedReader.readLine());
        int count = Integer.parseInt(bufferedReader.readLine());
        int sum = 0;
        for(int i = 0; i < count; ++i) {
            String[] product = bufferedReader.readLine().split(" ");
            int price = Integer.parseInt(product[0]);
            int amount = Integer.parseInt(product[1]);
            sum += (price * amount);
        }
        return money == sum;
    }

    private static void printResult(Boolean result) {
        if(result) {
            System.out.println("Yes");
        }
        else {
            System.out.println("No");
        }
    }
}
