import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Number_14425 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String[] count = bufferedReader.readLine().split(" ");

        int countWords = Integer.parseInt(count[0]);
        List<String> words = new ArrayList<>();
        saveString(countWords, bufferedReader, words);

        int countFindWords = Integer.parseInt(count[1]);
        String[] findWords = new String[countFindWords];
        saveString(countFindWords, bufferedReader, findWords);

        System.out.println(find(words, findWords));
    }

    private static void saveString(int count, BufferedReader bufferedReader, List<String> words) throws IOException {
        for(int i = 0; i < count; ++i) {
            words.add(bufferedReader.readLine());
        }
    }

    private static void saveString(int count, BufferedReader bufferedReader, String[] words) throws IOException {
        for(int i = 0; i < count; ++i) {
            words[i] = (bufferedReader.readLine());
        }
    }

    private static int find(List<String> words, String[] findWords) {
        int result = 0;
        for(String word : findWords) {
            if(words.contains(word)) {
                result++;
            }
        }
        return result;
    }
}
