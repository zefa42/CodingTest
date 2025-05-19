import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class Number_10102 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int count = Integer.parseInt(bufferedReader.readLine());

        Map<Character, Integer> votes = new HashMap<>();
        String rawVotes = bufferedReader.readLine();
        for(int i = 0; i < count; ++i) {
            votes.put(rawVotes.charAt(i), votes.getOrDefault(rawVotes.charAt(i), 0) + 1);
        }

        if(votes.getOrDefault('A', 0) > votes.getOrDefault('B', 0)) {
            System.out.println("A");
        }
        else if(votes.getOrDefault('A', 0) < votes.getOrDefault('B', 0)) {
            System.out.println("B");
        }
        else {
            System.out.println("Tie");
        }

    }
}
