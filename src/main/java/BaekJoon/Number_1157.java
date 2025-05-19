import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Number_1157 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String[] input = bufferedReader.readLine().toUpperCase().split("");
        System.out.println(findMostFrequentLetter(input));
    }

    private static String findMostFrequentLetter(String[] input) {
        Set<String> letter = new HashSet<>(Arrays.asList(input));
        Map<String, Integer> letters = new HashMap<>();
        for(String chr : letter) {
            letters.put(chr, 0);
        }
        for(int i = 0; i < input.length; ++i) {
            letters.put(input[i], letters.get(input[i]) + 1);
        }
        return mostFrequentLetter(mostFrequentCount(letter, letters), letter, letters);
    }

    private static int mostFrequentCount(Set<String> letter, Map<String, Integer> letters) {
        List<Integer> mostFrequentCount = new ArrayList<>();
        for(String chr : letter) {
            mostFrequentCount.add(letters.get(chr));
        }
        return Collections.max(mostFrequentCount);
    }

    private static String mostFrequentLetter(int count, Set<String> letter, Map<String, Integer> letters) {
        StringBuilder result = new StringBuilder();
        for(String chr : letter) {
            if(count == letters.get(chr)) {
                result.append(chr);
            }
        }
        if(result.length() > 1) {
            return "?";
        }
        return result.toString();
    }
}
