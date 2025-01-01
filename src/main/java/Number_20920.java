import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Number_20920 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String[] inputNumber = bufferedReader.readLine().split(" ");
        int count = Integer.parseInt(inputNumber[0]);
        int standard = Integer.parseInt(inputNumber[1]);
        Map<String, Integer> words = new HashMap<>();

        for(int i = 0; i < count; ++i) {
            String word = bufferedReader.readLine();
            if(word.length() >= standard) {
                words.put(word, words.getOrDefault(word, 0) + 1);
            }
        }

        List<String> tmpSortedWords = new ArrayList<>(words.keySet());
        tmpSortedWords.sort((word1, word2) -> {
            int frequency = words.get(word2) - words.get(word1);
            if(frequency != 0) {
                return frequency;
            }

            int length = word2.length() - word1.length();
            if(length != 0) {
                return length;
            }
            return word1.compareTo(word2);
        });

        Set<String> sortedWords = new LinkedHashSet<>(tmpSortedWords);
        StringBuilder result = new StringBuilder();
        for(String word : sortedWords) {
            result.append(word).append('\n');
        }
        System.out.println(result);
    }
}
