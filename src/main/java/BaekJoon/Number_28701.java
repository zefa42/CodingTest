import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Number_28701 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int number = Integer.parseInt(bufferedReader.readLine());
        String result = String.valueOf(getFirstResult(number)) + '\n'
                + getSecondResult(getFirstResult(number)) + '\n'
                + getThirdResult(number) + '\n';
        System.out.println(result);
    }

    private static int getFirstResult(int number) {
        int sum = 0;
        for(int i = 1; i <= number; ++i) {
            sum += i;
        }
        return sum;
    }

    private static int getSecondResult(int number) {
        return (int) Math.pow(number, 2);
    }

    private static int getThirdResult(int number) {
        int sum = 0;
        for(int i = 1; i <= number; ++i) {
            sum += (int) Math.pow(i, 3);
        }
        return sum;
    }
}
