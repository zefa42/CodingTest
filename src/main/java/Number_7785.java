import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Number_7785 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int count = Integer.parseInt(bufferedReader.readLine());

        Set<String> names = new HashSet<>();
        for(int i = 0; i < count; ++i) {
            String[] input = bufferedReader.readLine().split(" ");
            if(input[1].equals("enter")) {
                names.add(input[0]);
            }
            else if(input[1].equals("leave")) {
                names.remove(input[0]);
            }
        }
        List<String> sortedNames = new ArrayList<>(names);
        sortedNames.sort(Comparator.reverseOrder());

        StringBuilder result = new StringBuilder();
        for(String name : sortedNames) {
            result.append(name).append('\n');
        }
        System.out.println(result);
    }
}
