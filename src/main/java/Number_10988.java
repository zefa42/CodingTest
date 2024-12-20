import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Number_10988 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String[] input = bufferedReader.readLine().split("");
        System.out.println(findPalindrome(input));
    }
    private static int findPalindrome(String[] input) {
        for(int i = 0; i < input.length / 2; ++i) {
            if(!input[i].equals(input[input.length-1-i])) {
                return 0;
            }
        }
        return 1;
    }
}
