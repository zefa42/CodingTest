import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Number_5585 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int money = Integer.parseInt(bufferedReader.readLine());
        System.out.println(calculateExchange(money));
    }

    private static int calculateExchange(int money) {
        int exchange = 1000 - money;
        int count = 0;
        if(exchange / 500 > 0) {
            count += exchange / 500;
            exchange %= 500;
        }
        if(exchange / 100 > 0) {
            count += exchange / 100;
            exchange %= 100;
        }
        if(exchange / 50 > 0) {
            count += exchange / 50;
            exchange %= 50;
        }
        if(exchange / 10 > 0) {
            count += exchange / 10;
            exchange %= 10;
        }
        if(exchange / 5 > 0) {
            count += exchange / 5;
            exchange %= 5;
        }
        if(exchange < 5  && exchange > 0) {
            count += exchange;
        }
        return count;
    }
}
