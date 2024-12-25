import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Number_2231 {
    public static void main(String[] args) throws IOException {
        System.out.println(findConstructor(readNumber()));
    }

    private static String readNumber() throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        return bufferedReader.readLine();
    }

    private static int findConstructor(String number) {
        int N = Integer.parseInt(number);
        int sub = 0;
        int constructor = 0;
        for(int i = 0; i <number.length(); ++i) {
            sub += (Integer.parseInt(String.valueOf(number.charAt(i)))) * 2;
        }
        if(N - sub > 0) {
            constructor = (N - sub);
        }
        return constructor;
    }
}
