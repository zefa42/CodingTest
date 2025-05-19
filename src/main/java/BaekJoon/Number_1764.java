import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Number_1764 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String[] inputNumber = bufferedReader.readLine().split(" ");
        int N = Integer.parseInt(inputNumber[0]);
        int M = Integer.parseInt(inputNumber[1]);
        Set<String> nNames = new HashSet<>();
        for(int i = 0; i < N; ++i) {
            nNames.add(bufferedReader.readLine());
        }
        Set<String> mNames = new HashSet<>();
        for(int i = 0; i < M; ++i) {
            mNames.add(bufferedReader.readLine());
        }
        List<String> same = new ArrayList<>();
        for(String name : nNames) {
            if(mNames.contains(name)) {
                same.add(name);
            }
        }
        Collections.sort(same);
        StringBuilder result = new StringBuilder();
        result.append(same.size()).append('\n');
        for(String name : same) {
            result.append(name).append('\n');
        }
        System.out.println(result);
    }
}
