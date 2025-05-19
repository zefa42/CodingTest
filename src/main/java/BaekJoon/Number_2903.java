import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Number_2903 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int count = Integer.parseInt(bufferedReader.readLine());
        int[] save = new int[15];
        save[0] = 3;
        for(int i = 1; i < 15; ++i) {
            save[i] = save[i - 1] * 2 - 1;
        }
        System.out.println((int)Math.pow(save[count - 1], 2));
    }
}
