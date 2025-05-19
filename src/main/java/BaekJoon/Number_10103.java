import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Number_10103 {
    static int firstMan = 100;
    static int secondMan = 100;
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int count = Integer.parseInt(bufferedReader.readLine());

        for(int i = 0; i < count; ++i) {
            int[] input = Arrays.stream(bufferedReader.readLine().split(" "))
                            .mapToInt(Integer::parseInt)
                            .toArray();
            calculate(input);
        }
        System.out.println(firstMan);
        System.out.println(secondMan);
    }

    private static void calculate(int[] input) {
        if(input[0] > input[1]) {
            secondMan -= input[0];
        }
        else if(input[0] < input[1]) {
            firstMan -= input[1];
        }
    }
}
