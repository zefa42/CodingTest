import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Number_2908 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println(calculate(readNumbers(bufferedReader)));
    }

    private static String[] readNumbers(BufferedReader bufferedReader) throws IOException {
        return bufferedReader.readLine().split(" ");
    }

    private static int calculate(String[] numbers) {
        String first = numbers[0];
        String second = numbers[1];
        StringBuilder reversedFirst = new StringBuilder();
        StringBuilder reversedSecond = new StringBuilder();
        for(int i = first.length() - 1; i >= 0; --i) {
            reversedFirst.append(first.charAt(i));
        }
        for(int i = second.length() - 1; i >= 0; --i) {
            reversedSecond.append(second.charAt(i));
        }
        return Math.max(Integer.parseInt(reversedFirst.toString()), Integer.parseInt(reversedSecond.toString()));
    }
}
