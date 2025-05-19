import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Number_31994 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        
        String result = "";
        int max = 0;
        for(int i = 0; i < 7; ++i) {
            String[] input = bufferedReader.readLine().split(" ");
            String name = input[0];
            int count = Integer.parseInt(input[1]);
            if(max < count) {
                max = count;
                result = name;
            }
        }
        System.out.println(result);
    }
}
