import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Number_9086 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int count = Integer.parseInt(bufferedReader.readLine());
        for(int i = 0; i < count; ++i) {
            System.out.println(printFirstAndLast(bufferedReader.readLine()));
        }
    }

    private static String printFirstAndLast(String input) {
        StringBuilder s = new StringBuilder();
        char first = input.charAt(0);
        char last = input.charAt(input.length() - 1);
        if(input.length() > 1) {;
            return s.append(first).append(last).toString();
        }
        return s.append(first).append(first).toString();
    }
}
