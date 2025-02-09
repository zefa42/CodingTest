import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Number_2747 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int number = Integer.parseInt(bufferedReader.readLine());
        int[] save = new int[46];
        System.out.println(saveFibonacci(number, save));
    }

    private static int saveFibonacci(int number, final int[] save) {
        if(save[number] > 0) {
            return save[number];
        }
        if(number == 0) return 0;
        if(number == 1) return 1;

        return save[number] = saveFibonacci(number - 1, save) + saveFibonacci(number - 2, save);
    }


}
