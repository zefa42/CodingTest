import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Number_1264 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String line;

        while((line = bufferedReader.readLine()) != null) {
            if(line.equals("#")) {
                break;
            }
            int sum = 0;
            for(int i = 0; i < line.length(); ++i) {
                char c = Character.toLowerCase(line.charAt(i));
                if(c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                    sum++;
                }
            }
            System.out.println(sum);
        }
    }
}
