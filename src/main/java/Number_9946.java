import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class Number_9946 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder result = new StringBuilder();
        int caseCount = 1;

        String firstInput;
        while(true) {
            firstInput = bufferedReader.readLine();
            Map<Character, Integer> firstAlphabets = new HashMap<>();
            for(int i = 0; i < firstInput.length(); ++i) {
                firstAlphabets.put(firstInput.charAt(i), firstAlphabets.getOrDefault(firstInput.charAt(i), 0) + 1);
            }

            String secondInput = bufferedReader.readLine();
            if(firstInput.equals("END") && firstInput.equals(secondInput)) {
                break;
            }

            Map<Character, Integer> secondAlphabets = new HashMap<>();
            for(int i = 0; i < secondInput.length(); ++i) {
                secondAlphabets.put(secondInput.charAt(i), secondAlphabets.getOrDefault(secondInput.charAt(i), 0) + 1);
            }

            int same = 0;
            for(Character alphabet : firstAlphabets.keySet()) {
                if(!secondAlphabets.containsKey(alphabet)) {
                    result.append("Case ").append(caseCount++).append(": ").append("different").append('\n');
                    break;
                }
                if(!Objects.equals(secondAlphabets.getOrDefault(alphabet, 0), firstAlphabets.get(alphabet))) {
                    result.append("Case ").append(caseCount++).append(": ").append("different").append('\n');
                    break;
                }
                same++;
            }
            if(same == firstAlphabets.size()) {
                result.append("Case ").append(caseCount++).append(": ").append("same").append('\n');
            }
        }
        System.out.println(result);
    }
}
