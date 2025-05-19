import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class Number_9946 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder result = new StringBuilder();
        int caseCount = 1;

        while (true) {
            String firstInput = bufferedReader.readLine();
            String secondInput = bufferedReader.readLine();
            if(isEnd(firstInput, secondInput)) {
                break;
            }

            if(isSameString(firstInput, secondInput)) {
                result.append("Case ").append(caseCount++).append(": ").append("same").append('\n');
            }
            else {
                result.append("Case ").append(caseCount++).append(": ").append("different").append('\n');
            }
        }
        System.out.println(result);
    }

    private static boolean isEnd(String first, String second) {
        return first.equals("END") && first.equals(second);
    }

    private static boolean isSameString(String first, String second) {
        if(first.length() != second.length()) {
            return false;
        }

        Map<Character, Integer> firstAlphabets = new HashMap<>();
        for (int i = 0; i < first.length(); ++i) {
            firstAlphabets.put(first.charAt(i), firstAlphabets.getOrDefault(first.charAt(i), 0) + 1);
        }

        for(int i = 0; i < second.length(); ++i) {
            int count = firstAlphabets.getOrDefault(second.charAt(i), 0) - 1;
            if(count < 0) {
                return false;
            }
            firstAlphabets.put(second.charAt(i), count);
        }
        return true;
    }
}