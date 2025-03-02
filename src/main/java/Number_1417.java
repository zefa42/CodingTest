import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Number_1417 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int count = Integer.parseInt(bufferedReader.readLine());
        if(count == 1) {
            System.out.println("0");
            return;
        }

        int standard = Integer.parseInt(bufferedReader.readLine());
        int[] candidates = new int[count - 1];
        for(int i = 0; i < count - 1; ++i) {
            candidates[i] = Integer.parseInt(bufferedReader.readLine());
        }

        int minPerson = 0;
        while(true) {
            Arrays.sort(candidates);
            if(candidates[count - 2] < standard) {
                break;
            }
            candidates[count - 2]--;
            minPerson++;
            standard++;
        }
        System.out.println(minPerson);
    }
}
