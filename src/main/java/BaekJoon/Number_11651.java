import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Number_11651 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int count = Integer.parseInt(bufferedReader.readLine());
        List<Position> positions = new ArrayList<>();

        for(int i = 0; i < count; ++i) {
            int[] position = Arrays.stream(bufferedReader.readLine().split(" "))
                    .mapToInt(Integer::parseInt)
                    .toArray();
            positions.add(new Position(position[0], position[1]));
        }

        Collections.sort(positions);

        StringBuilder result = new StringBuilder();
        for(Position position : positions) {
            result.append(position.x).append(" ").append(position.y).append('\n');
        }
        System.out.println(result);
    }

    private static class Position implements Comparable<Position> {
        int x;
        int y;

        public Position(int x, int y) {
            this.x = x;
            this.y = y;
        }

        @Override
        public int compareTo(Position position) {
            if(this.y != position.y) {
                return this.y - position.y;
            }
            return this.x - position.x;
        }
    }
}
