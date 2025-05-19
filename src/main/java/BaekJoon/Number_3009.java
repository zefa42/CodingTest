import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Number_3009 {
    public static void main(String[] args) throws IOException {
        System.out.println(readNumbers());
    }

    private static String readNumbers() throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        List<String> x = new ArrayList<>();
        List<String> y = new ArrayList<>();
        Map<String, Integer> saveX = new HashMap<>();
        Map<String, Integer> saveY = new HashMap<>();

        for(int i = 0; i < 3; ++i) {
            String[] numbers = bufferedReader.readLine().split(" ");
            x.add(numbers[0]);
            y.add(numbers[1]);
        }
        Set<String> numberX = new HashSet<>(x);
        Set<String> numberY = new HashSet<>(y);
        for(String number : numberX) {
            saveX.put(number, 0);
        }
        for(String number : numberY) {
            saveY.put(number, 0);
        }
        for(String number : x) {
            saveX.put(number, saveX.get(number) + 1);
        }
        for(String number : y) {
            saveY.put(number, saveY.get(number) + 1);
        }
        String resultX = "";
        String resultY = "";
        for(String number : numberX) {
            if(saveX.get(number) == 1) {
                resultX = number;
            }
        }
        for(String number : numberY) {
            if(saveY.get(number) == 1) {
                resultY = number;
            }
        }
        return resultX + " " + resultY;
    }
}
