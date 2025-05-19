import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Number_1546 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int count = Integer.parseInt(bufferedReader.readLine());
        List<Integer> scores = new ArrayList<>();
        String[] rawScores = bufferedReader.readLine().split(" ");
        for(int i = 0; i < count; ++i) {
            scores.add(Integer.parseInt(rawScores[i]));
        }
        int max = Collections.max(scores);
        double sum = 0;
        for(Integer score : scores) {
            sum += (double) score /max * 100;
        }
        System.out.println(sum / count);
    }
}
