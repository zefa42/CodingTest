import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Number_2439 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int count = Integer.parseInt(bufferedReader.readLine());
        for(int i = 0; i < count; ++i) {
            for(int j = 0; j < count; ++j) {
                if(i+j < count - 1) {
                    System.out.print(" ");
                }
                else {
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }
}
