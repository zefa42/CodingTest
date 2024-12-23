import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Number_5086 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        while (true) {
            String[] numbers = bufferedReader.readLine().split(" ");
            int first = Integer.parseInt(numbers[0]);
            int second = Integer.parseInt(numbers[1]);

            if(first == 0 && second == 0) {
                break;
            }
            if(first % second == 0) {
                System.out.println("multiple");
            }
            else if(second % first == 0) {
                System.out.println("factor");
            }
            else {
                System.out.println("neither");
            }
        }
    }
}
