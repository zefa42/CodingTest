import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Number_1371 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String input;
        Map<Character, Integer> chars = new HashMap<>();
        while((input = bufferedReader.readLine()) != null) {
            for(int i = 0; i < input.length(); ++i) {
                if(input.charAt(i) < 'a' || input.charAt(i) > 'z') {
                    continue;
                }
                chars.put(input.charAt(i), chars.getOrDefault(input.charAt(i), 0) + 1);
            }
        }
        bufferedReader.close();

        int max = 0;
        for(Character character : chars.keySet()) {
            if(chars.get(character) >= max) {
                max = chars.get(character);
            }
        }

        List<Character> sortedChars = new ArrayList<>();
        for(Character character : chars.keySet()) {
            if(chars.get(character) == max) {
                sortedChars.add(character);
            }
        }
        Collections.sort(sortedChars);

        for(Character character : sortedChars) {
            System.out.print(character);
        }
    }
}
