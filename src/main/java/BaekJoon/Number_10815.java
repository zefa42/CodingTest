import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

public class Number_10815 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int count = Integer.parseInt(bufferedReader.readLine());
        String[] rawNumbers = bufferedReader.readLine().split(" ");
        Set<Integer> numbers = new HashSet<>();
        for(int i = 0; i < count; ++i) {
            numbers.add(Integer.parseInt(rawNumbers[i]));
        }

        int countFind = Integer.parseInt(bufferedReader.readLine());
        int[] findNumbers = new int[countFind];
        String[] rawFindNumbers = bufferedReader.readLine().split(" ");
        for(int i = 0; i < countFind; ++i) {
            findNumbers[i] = Integer.parseInt(rawFindNumbers[i]);
        }

        StringBuilder result = new StringBuilder();
        for(int i = 0; i < countFind; ++i) {
            if(numbers.contains(findNumbers[i])) {
                result.append("1").append(" ");
            }
            else {
                result.append("0").append(" ");
            }
        }
        System.out.println(result);
    }
}
