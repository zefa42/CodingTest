import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class Number_11098 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int count = Integer.parseInt(bufferedReader.readLine());
        StringBuilder result = new StringBuilder();
        for(int i = 0; i < count; ++i) {
            int playerCount = Integer.parseInt(bufferedReader.readLine());
            Map<Integer, String> players = new HashMap<>();
            int max = 0;
            for(int j = 0; j < playerCount; ++j) {
                String[] input = bufferedReader.readLine().split(" ");
                int money = Integer.parseInt(input[0]);
                String name = input[1];
                if(max < money) max = money;
                players.put(money, name);
            }
            result.append(players.get(max)).append('\n');
        }
        System.out.println(result);
    }
}
