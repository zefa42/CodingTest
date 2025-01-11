import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Number_11660 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String[] input = bufferedReader.readLine().split(" ");
        int matrixSize = Integer.parseInt(input[0]);
        int calculateCount = Integer.parseInt(input[1]);

        int[][] sum = new int[matrixSize + 1][matrixSize + 1];
        int[][] matrix = new int[matrixSize + 1][matrixSize + 1];
        for(int i = 1; i <= matrixSize; ++i) {
            String[] row = bufferedReader.readLine().split(" ");
            for(int j = 1; j <= matrixSize; ++j) {
                matrix[i][j] = Integer.parseInt(row[j - 1]);
                sum[i][j] = sum[i - 1][j] + sum[i][j - 1] - sum[i - 1][j - 1] + matrix[i][j];
            }
        }

        StringBuilder result = new StringBuilder();
        for(int i = 0; i < calculateCount; ++i) {
            String[] calculateRange = bufferedReader.readLine().split(" ");
            int x1 = Integer.parseInt(calculateRange[0]);
            int y1 = Integer.parseInt(calculateRange[1]);
            int x2 = Integer.parseInt(calculateRange[2]);
            int y2 = Integer.parseInt(calculateRange[3]);

            int rangeSum = sum[x2][y2] - sum[x1 - 1][y2] - sum[x2][y1 - 1] + sum[x1 - 1][y1 - 1];
            result.append(rangeSum).append('\n');
        }
        System.out.println(result);
    }
}
