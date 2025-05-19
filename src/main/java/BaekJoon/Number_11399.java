import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Number_11399 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int count = Integer.parseInt(bufferedReader.readLine());
        List<Integer> people = new ArrayList<>();
        String[] rawPeople = bufferedReader.readLine().split(" ");
        for(int i = 0; i < count; ++i) {
            people.add(Integer.parseInt(rawPeople[i]));
        }
        Collections.sort(people);

        int sum = 0;
        int result = 0;
        for(Integer person : people) {
            sum += person;
            result += sum;
        }
        System.out.println(result);
    }
}
