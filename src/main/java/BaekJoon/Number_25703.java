import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Number_25703 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int count = Integer.parseInt(bufferedReader.readLine());
        StringBuilder result = new StringBuilder();
        result.append("int a;").append('\n');
        result.append("int *ptr = &a;").append('\n');
        if(count == 1) {
            System.out.println(result);
            return;
        }
        int tmp = count;
        for(int i = 0; i < count - 1; ++i) {
            result.append("int ");
            for (int j = 0; j <= i + 1; ++j) {
                result.append("*");
            }
            if (i == 0) {
                result.append("ptr").append(i + 2).append(" = ").append("&ptr;").append('\n');
            }
            else {
                result.append("ptr").append(i + 2).append(" = ").append("&ptr").append(i + 1).append(';').append('\n');
                tmp++;
            }
        }
        System.out.println(result);
    }
}
