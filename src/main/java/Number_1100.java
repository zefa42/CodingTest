import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Number_1100 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int result = 0;
        for(int i = 0; i < 8; ++i) {
            String[] input = bufferedReader.readLine().split("");
            for(int j = 0; j < 8; ++j) {
                if(i % 2 == 0) {
                    if(j % 2 == 0) {
                        if(input[j].equals("F")) {
                            result++;
                        }
                    }
                }
                else {
                    if(j % 2 != 0) {
                        if(input[j].equals("F")) {
                            result++;
                        }
                    }
                }
            }
        }
        System.out.println(result);
    }
}
