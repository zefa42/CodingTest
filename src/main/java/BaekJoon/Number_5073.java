import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Number_5073 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        while(true) {
            int[] triangle = Arrays.stream(bufferedReader.readLine().split(" "))
                    .mapToInt(Integer::parseInt)
                    .sorted()
                    .toArray();
            if(triangle[0] == 0) {
                break;
            }
            if(triangle[2] >= triangle[0] + triangle[1]) {
                System.out.println("Invalid");
            }
            else if(triangle[0] == triangle[1] && triangle[1] == triangle[2]) {
                System.out.println("Equilateral");
            }
            else if(triangle[0] != triangle[1] && triangle[1] != triangle[2] && triangle[0] != triangle[2]) {
                System.out.println("Scalene");
            }
            else {
                System.out.println("Isosceles");
            }
        }
    }
}
