import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedHashMap;
import java.util.Map;

public class Number_1620 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String[] count = bufferedReader.readLine().split(" ");
        int monNameCount = Integer.parseInt(count[0]);
        Map<String, Integer> names = new LinkedHashMap<>();
        String[] nameIndex = new String[monNameCount + 1];
        for(int i = 1; i <= monNameCount; ++i) {
            String input = bufferedReader.readLine();
            names.put(input, i);
            nameIndex[i] = input;
        }

        int inputCount = Integer.parseInt(count[1]);
        StringBuilder result = new StringBuilder();
        for(int i = 1; i <= inputCount; ++i) {
            String inputFind = bufferedReader.readLine();
            if(Character.isDigit(inputFind.charAt(0))) {
                result.append(nameIndex[Integer.parseInt(inputFind)]).append('\n');
            }
            else {
                result.append(names.get(inputFind)).append('\n');
            }
        }
        System.out.println(result);
    }
}
