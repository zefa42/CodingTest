import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class Number_1181 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int count = Integer.parseInt(bufferedReader.readLine());
        Set<String> words = new LinkedHashSet<>();
        for (int i = 0; i < count; ++i) {
            words.add(bufferedReader.readLine());
        }
        List<String> uniqueWords = new ArrayList<>(words);

        // 정렬 (길이 → 사전순)
        Collections.sort(uniqueWords, (word1, word2) -> {
            if (word1.length() == word2.length()) {
                return word1.compareTo(word2); // 길이가 같으면 사전순
            }
            return Integer.compare(word1.length(), word2.length()); // 길이로 정렬
        });

        for (String word : uniqueWords) {
            System.out.println(word);
        }
    }
}
