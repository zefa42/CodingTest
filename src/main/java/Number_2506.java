import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Number_2506 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int count = Integer.parseInt(bufferedReader.readLine());
        String[] scores = bufferedReader.readLine().strip().split("0");
        int[] save = new int[count + 1];
        for(int i = 0; i < count; ++i) {
            save[i + 1] = save[i] + 1 + i;
        }
        int sum = 0;
        for (String score : scores) {
            sum += save[score.replace(" ","").length()];
        }
        System.out.println(sum);
    }
}
