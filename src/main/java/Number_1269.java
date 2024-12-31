import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Number_1269 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String[] count = bufferedReader.readLine().split(" ");

        int countA = Integer.parseInt(count[0]);
        int[] rawA = Arrays.stream(bufferedReader.readLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();
        Set<Integer> A = new HashSet<>();
        for(Integer number : rawA) {
            A.add(number);
        }

        int countB = Integer.parseInt(count[1]);
        int[] rawB = Arrays.stream(bufferedReader.readLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();
        Set<Integer> B = new HashSet<>();
        for(Integer number : rawB) {
            B.add(number);
        }

        int aMinusB = countA;
        int bMinusA = countB;

        for(Integer number : rawA) {
            if(B.contains(number)) {
                aMinusB--;
            }
        }

        for(Integer number : rawB) {
            if(A.contains(number)) {
                bMinusA--;
            }
        }

        System.out.println(aMinusB + bMinusA);
    }
}
