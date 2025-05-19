import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Number_2292 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int roomNumber = Integer.parseInt(bufferedReader.readLine());
        long count = 1;
        long range = 1;
        while(range < roomNumber) {
            range += 6 * count;
            count++;
        }
        System.out.println(count);
    }
}
