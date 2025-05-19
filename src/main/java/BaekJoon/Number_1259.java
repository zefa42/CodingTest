import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Number_1259 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String input;
        StringBuilder result = new StringBuilder();
        while(!(input = bufferedReader.readLine()).equals("0")) {
            boolean isPalindrome = true;
            for(int i = 0; i < input.length() / 2; ++i) {
                if(input.charAt(i) != input.charAt(input.length() - 1 - i)) {
                    isPalindrome = false;
                    break;
                }
            }
            if(isPalindrome) {
                result.append("yes").append('\n');
            }
            else {
                result.append("no").append('\n');
            }
        }
        System.out.println(result);
    }
}
