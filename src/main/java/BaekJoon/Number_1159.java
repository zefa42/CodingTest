import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Map;
import java.util.TreeMap;

public class Number_1159 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int count = Integer.parseInt(bufferedReader.readLine());
        Map<Character, Integer> firstName = new TreeMap<>();
        for (int i = 0; i < count; ++i) {
            String name = bufferedReader.readLine();
            firstName.put(name.charAt(0), firstName.getOrDefault(name.charAt(0), 0) + 1);
        }
        StringBuilder result = new StringBuilder();
        for (Character name : firstName.keySet()) {
            if (firstName.get(name) >= 5) {
                result.append(name);
            }
        }

        if (result.isEmpty()) {
            System.out.println("PREDAJA");
        } else {
            System.out.println(result);
        }
    }
}
