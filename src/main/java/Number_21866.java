import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Number_21866 {
    public static void main(String[] args) throws IOException {
        int[] standards = {100, 100, 200, 200, 300, 300, 400, 400, 500};
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int[] scores = Arrays.stream(bufferedReader.readLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();
        int sum = 0;
        for(int i = 0; i < standards.length; ++i) {
            if(scores[i] > standards[i]) {
                System.out.println("hacker");
                return;
            }
            sum += scores[i];
        }
        if(sum >= 100) {
            System.out.println("draw");
        }
        else {
            System.out.println("none");
        }
    }
}
