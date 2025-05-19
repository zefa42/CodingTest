import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Number_2839 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int weight = Integer.parseInt(bufferedReader.readLine());
        int countFive = weight / 5;
        int remain = weight % 5;
        int result = countFive;

        while(remain > 0) {
            if(result == - 1) {
                break;
            }
            if(remain % 3 == 0) {
                result += remain / 3;
                break;
            }
            else {
                result--;
                remain += 5;
            }
        }
        System.out.println(result);
    }
}
