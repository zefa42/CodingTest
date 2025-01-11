import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Number_32978 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int count = Integer.parseInt(bufferedReader.readLine());
        String[] rawGiven = bufferedReader.readLine().split(" ");
        String[] used = bufferedReader.readLine().split(" ");
        Set<String> given = new HashSet<>(Arrays.asList(used));
        for(int i = 0; i < count; ++i) {
            if(!given.contains(rawGiven[i])) {
                System.out.println(rawGiven[i]);
            }
        }
    }
}
