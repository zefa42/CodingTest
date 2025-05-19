import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Number_1110 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int number = Integer.parseInt(bufferedReader.readLine());
        int tmp = number;
        int cycleCount = 0;
        do {
            cycleCount++;
            tmp = findNewNumber(tmp);
        } while (number != tmp);
        System.out.println(cycleCount);
    }

    public static int findNewNumber(int number) {
        int first = number % 10;
        int tmp = number / 10;
        int second = first + tmp;
        int newNumber = (first * 10) + second;
        if(newNumber > 9) {
            return (first * 10) + (second % 10);
        }
        return newNumber;
    }
}
