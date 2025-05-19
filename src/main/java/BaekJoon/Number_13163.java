import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Number_13163 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int count = Integer.parseInt(bufferedReader.readLine());
        StringBuilder result = new StringBuilder();
        for(int i = 0; i < count; ++i) {
            String[] input = bufferedReader.readLine().split(" ");
            addFirstGod(result, getNickName(input));
        }
        System.out.println(result);
    }

    private static String getNickName(String[] input) {
        int length = input.length;
        StringBuilder nickName = new StringBuilder();
        for(int i = 1; i < length; ++i) {
            nickName.append(input[i]);
        }
        return nickName.toString();
    }

    private static void addFirstGod(StringBuilder result, String name) {
        result.append("god").append(name).append('\n');
    }
}
