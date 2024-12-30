import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class Number_10816 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int count = Integer.parseInt(bufferedReader.readLine());
        int[] cards = new int[count];
        Map<Integer, Integer> find = new HashMap<>();
        String[] input1 = bufferedReader.readLine().split(" ");
        for(int i = 0; i < count; ++i) {
            cards[i] = Integer.parseInt(input1[i]);
            find.put(cards[i], find.getOrDefault(cards[i], 0) + 1);
        }

        int countFind = Integer.parseInt(bufferedReader.readLine());
        int[] findCards = new int[countFind];
        String[] input2 = bufferedReader.readLine().split(" ");
        for(int i = 0; i < countFind; ++i) {
            findCards[i] = Integer.parseInt(input2[i]);
        }

        StringBuilder result = new StringBuilder();
        for(int i = 0; i < countFind; ++i) {
            if(find.get(findCards[i]) != null) {
                result.append(find.get(findCards[i])).append(" ");
            }
            else  {
                result.append("0").append(" ");
            }
        }
        System.out.println(result);
    }
}
