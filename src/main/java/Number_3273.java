import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Number_3273 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int count = Integer.parseInt(bufferedReader.readLine());
        int[] numbers = new int[count];
        String[] rawNumbers = bufferedReader.readLine().split(" ");
        for(int i = 0; i < count; ++i) {
            numbers[i] = Integer.parseInt(rawNumbers[i]);
        }
        Arrays.sort(numbers);

        int sum = Integer.parseInt(bufferedReader.readLine());

        int left = 0;
        int right = count - 1;
        long result = 0;

        while(left < right) {
            if(numbers[left] + numbers[right] == sum) {
                result++;
                left++;
                right--;
            }
            else if(numbers[left] + numbers[right] > sum) {
                right--;
            }
            else {
                left++;
            }
        }
        System.out.println(result);
    }
}
