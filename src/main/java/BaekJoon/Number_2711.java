import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Number_2711 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int count = Integer.parseInt(bufferedReader.readLine());
        StringBuilder result = new StringBuilder();

        for(int i = 0; i < count; ++i) {
            String[] input = bufferedReader.readLine().split(" ");
            int index = Integer.parseInt(input[0]) - 1;
            String string = input[1];
            result.append(removeTypo(index, string)).append('\n');
        }
        System.out.println(result);
    }

    private static String removeTypo(int index, String input) {
        return input.substring(0, index) + input.substring(index + 1);
    }
}
