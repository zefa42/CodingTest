import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Number_5565 {
    private static final int BOOK_COUNT = 9;
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int totalPrice = Integer.parseInt(bufferedReader.readLine());
        for(int i = 0; i < BOOK_COUNT; ++i) {
            totalPrice -= Integer.parseInt(bufferedReader.readLine());
        }
        System.out.println(totalPrice);
    }
}
