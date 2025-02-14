import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Number_11652 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int count = Integer.parseInt(bufferedReader.readLine());
        Map<Long, Integer> cards = new HashMap<>();
        for(int i = 0; i < count; ++i) {
            long input = Long.parseLong(bufferedReader.readLine());
            cards.put(input, cards.getOrDefault(input, 0) + 1);
        }

        int max = 0;
        for(Long card : cards.keySet()) {
            if(cards.get(card) > max) {
                max = cards.get(card);
            }
        }

        List<Long> result = new ArrayList<>();
        for(Long card : cards.keySet()) {
            if(cards.get(card) == max) {
                result.add(card);
            }
        }
        Collections.sort(result);
        System.out.println(result.getFirst());
    }
}
