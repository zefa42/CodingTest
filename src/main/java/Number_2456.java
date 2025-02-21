import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Number_2456 {
    private static final int NUMBER_OF_CANDIDATES = 3;

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int count = Integer.parseInt(bufferedReader.readLine());
        Candidate[] candidates = new Candidate[NUMBER_OF_CANDIDATES];

        for(int i = 0; i < NUMBER_OF_CANDIDATES; ++i) {
            candidates[i] = new Candidate(i + 1);
        }

        for(int i = 0; i < count; ++i) {
            int[] input = Arrays.stream(bufferedReader.readLine().split(" "))
                    .mapToInt(Integer::parseInt)
                    .toArray();
            for(int j = 0; j < input.length; ++j) {
                candidates[j].setPoint(input[j]);
            }
        }

        Arrays.sort(candidates, (c1, c2) -> {
            if(c1.getTotalPoint() != c2.getTotalPoint()) {
                return c2.getTotalPoint() - c1.getTotalPoint();
            }
            if(c1.threePointCount != c2.threePointCount) {
                return c2.threePointCount - c1.threePointCount;
            }
            return c2.twoPointCount - c1.twoPointCount;
        });

        //결과 출력부
        if (candidates[0].getTotalPoint() == candidates[1].getTotalPoint() &&
                candidates[0].threePointCount == candidates[1].threePointCount &&
                candidates[0].twoPointCount == candidates[1].twoPointCount) {
            System.out.println("0 " + candidates[0].getTotalPoint());
        }
        else {
            System.out.println(candidates[0].id + " " + candidates[0].getTotalPoint());
        }
    }

    private static class Candidate {
        int id;
        int onePointCount = 0;
        int twoPointCount = 0;
        int threePointCount = 0;

        public Candidate(int id) {
            this.id = id;
        }

        public void setPoint(int point) {
            if(point == 1) {
                onePointCount++;
            }
            if(point == 2) {
                twoPointCount++;
            }
            if(point == 3) {
                threePointCount++;
            }
        }

        public int getTotalPoint() {
            return (onePointCount) + (twoPointCount * 2) + (threePointCount * 3);
        }
    }
}
