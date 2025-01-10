import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class Number_16139 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String string = bufferedReader.readLine();
        Map<Integer, String> index = new HashMap<>();
        for(int i = 0; i < string.length(); ++i) {
            index.put(i, String.valueOf(string.charAt(i)));
        }
        int count = Integer.parseInt(bufferedReader.readLine());
        StringBuilder result = new StringBuilder();
        for(int i = 0; i < count; ++i) {
            int sum = 0;
            String[] input = bufferedReader.readLine().split(" ");
            String first = String.valueOf(input[0]);
            int start = Integer.parseInt(input[1]);
            int end = Integer.parseInt(input[2]);
            for(int j = start; j <= end; ++j) {
                if(index.get(j).equals(first)) {
                    sum++;
                }
            }
            result.append(sum).append('\n');
        }
        System.out.println(result);
    }
}
