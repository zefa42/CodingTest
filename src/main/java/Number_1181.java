import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Number_1181 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int count = Integer.parseInt(bufferedReader.readLine());
        Set<String> words = new HashSet<>();
        for(int i = 0; i < count; ++i) {
            words.add(bufferedReader.readLine());
        }

        List<String> result = new ArrayList<>(words);
        result.sort((word1, word2) -> {
            if (word1.length() == word2.length()) {
                return word1.compareTo(word2);
            }
            return Integer.compare(word1.length(), word2.length());
        });

        for(String word : result) {
            System.out.println(word);
        }
    }
}
