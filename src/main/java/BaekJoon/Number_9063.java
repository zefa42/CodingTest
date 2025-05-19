import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Number_9063 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int count = Integer.parseInt(bufferedReader.readLine());
        List<Integer> x = new ArrayList<>();
        List<Integer> y = new ArrayList<>();
        for(int i = 0; i < count; ++i) {
            int[] numbers = Arrays.stream(bufferedReader.readLine().split(" "))
                    .mapToInt(Integer::parseInt)
                    .toArray();
            x.add(numbers[0]);
            y.add(numbers[1]);
        }
        if(x.size() == 1 && y.size() == 1) {
            System.out.println("0");
        }
        else {
            int xMax = Collections.max(x);
            int xMin = Collections.min(x);
            int yMax = Collections.max(y);
            int yMin = Collections.min(y);
            System.out.println((xMax - xMin) * (yMax - yMin));
        }
    }
}
