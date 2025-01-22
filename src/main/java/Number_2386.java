import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Number_2386 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder result = new StringBuilder();
        String input;
        while(!(input = bufferedReader.readLine()).equals("#")) {
            char alphabet = input.charAt(0);
            String string = input.substring(2);
            int count = 0;
            for(int i = 0; i < string.length(); ++i) {
                if(Character.toLowerCase(string.charAt(i)) == alphabet) {
                    count++;
                }
            }
            result.append(alphabet).append(" ").append(count).append('\n');
        }
        System.out.println(result);
    }
}
