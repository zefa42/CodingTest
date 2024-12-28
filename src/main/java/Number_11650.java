import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Number_11650 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int count = Integer.parseInt(bufferedReader.readLine());
        List<Position> positions = new ArrayList<>();

        for(int i = 0; i < count; ++i) {
            int[] input = Arrays.stream(bufferedReader.readLine().split(" "))
                    .mapToInt(Integer::parseInt)
                    .toArray();
            positions.add(new Position(input[0], input[1]));
        }
        Collections.sort(positions);

        StringBuilder result = new StringBuilder();
        for(Position position : positions) {
            result.append(position.x).append(" ").append(position.y).append('\n');
        }

        System.out.println(result.toString());
    }

    static class Position implements Comparable<Position> {
        int x;
        int y;

        public Position(int x, int y) {
            this.x = x;
            this.y = y;
        }

        @Override
        public int compareTo(Position position) {
            if(this.x != position.x) {
                return this.x - position.x;
            }
            return this.y - position.y;
        }
    }
}
