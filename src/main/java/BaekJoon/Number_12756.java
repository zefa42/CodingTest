import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Number_12756 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int[] playerA = Arrays.stream(bufferedReader.readLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();
        int[] playerB = Arrays.stream(bufferedReader.readLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        int healthA = playerA[1];
        int healthB = playerB[1];

        while(healthA > 0 && healthB > 0) {
            healthA -= playerB[0];
            healthB -= playerA[0];
        }

        if(healthA > 0 && healthB <= 0) {
            System.out.println("PLAYER A");
        }
        else if(healthA <= 0 && healthB > 0) {
            System.out.println("PLAYER B");
        }
        else {
            System.out.println("DRAW");
        }
    }
}
