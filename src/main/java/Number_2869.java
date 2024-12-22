import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Number_2869 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String[] input = bufferedReader.readLine().split(" ");
        System.out.println(calculate(input));
    }

    private static int calculateWithWhile(String[] input) {
        int up = Integer.parseInt(input[0]);
        int down = Integer.parseInt(input[1]);
        int destination = Integer.parseInt(input[2]);
        int currentPosition = 0;
        int day = 0;
        while (true) {
            day++;
            currentPosition += up;
            if(currentPosition >= destination) {
                break;
            }
            currentPosition -= down;
        }
        return day;
    }

    private static long calculate(String[] input) {
        int up = Integer.parseInt(input[0]);
        int down = Integer.parseInt(input[1]);
        int destination = Integer.parseInt(input[2]);
        long day = (destination - down - 1) / (up - down) + 1;
        return day;
    }
}
