import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Number_10101 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int[] numbers = new int[3];
        int sum = 0;
        for(int i = 0; i < 3; ++i) {
            int number = Integer.parseInt(bufferedReader.readLine());
            numbers[i] = number;
            sum += number;
        }
        System.out.println(findCondition(numbers, sum));
    }

    private static String findCondition(int[] numbers, int sum) {
        if(sum == 180) {
            if((numbers[0] == numbers[1]) && (numbers[1] == numbers[2])) {
                return "Equilateral";
            }
            if(numbers[0] == numbers[1] || numbers[0] == numbers[2] || numbers[1] == numbers[2]) {
                return "Isosceles";
            }
            return "Scalene";
        }
        return "Error";
    }
}
