import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Number_10797 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int day = Integer.parseInt(bufferedReader.readLine());
        int[] cars = Arrays.stream(bufferedReader.readLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();
        int count = 0;
        for(int car : cars) {
            if(car == day) {
                count++;
            }
        }
        System.out.println(count);
    }
}
