import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Number_9506 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        while (true) {
            String line = br.readLine();
            int number = Integer.parseInt(line);
            if (number == -1) {
                break;
            }
            printPerfectNumber(number);
        }
    }

    private static void printPerfectNumber(int number) {
        List<Integer> factors = new ArrayList<>();
        for(int i = 1; i < number - 1; ++i) {
            if(number % i == 0) {
                factors.add(i);
            }
        }
        int sum = 0;
        StringBuilder result = new StringBuilder();
        for(Integer factor : factors) {
            result.append(factor).append(" + ");
            sum += factor;
        }
        if(sum == number) {
            System.out.print(number + " = ");
            System.out.println(result.substring(0, result.length() - 3));
        }
        else {
            System.out.println(number + " is NOT perfect.");
        }
    }
}
