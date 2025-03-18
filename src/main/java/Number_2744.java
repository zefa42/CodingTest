import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Number_2744 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String input = bufferedReader.readLine();
        System.out.println(convertAlphabet(input));
    }

    private static String convertAlphabet(String input) {
        StringBuilder result = new StringBuilder();
         for(int i = 0; i < input.length(); ++i) {
             if(Character.isUpperCase(input.charAt(i))) {
                 result.append(Character.toLowerCase(input.charAt(i)));
             }
             else {
                 result.append(Character.toUpperCase(input.charAt(i)));
             }
         }
         return result.toString();
    }
}
