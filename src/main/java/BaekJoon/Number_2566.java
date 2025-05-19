import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Number_2566 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        printResult(findMaxAndPosition(createMatrix(bufferedReader)));
    }

    private static int[][] createMatrix(BufferedReader bufferedReader) throws IOException {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 9; i++) {
            sb.append(bufferedReader.readLine()).append(" ");
        }
        String[] input = sb.toString().trim().split(" ");

        int[][] matrix = new int[9][9];
        int k = 0;
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                matrix[i][j] = Integer.parseInt(input[k++]);
            }
        }
        return matrix;
    }

    private static int[] findMaxAndPosition(int[][] matrix) {
        int max = 0;
        int row = 0;
        int column = 0;
        for(int i = 0; i < 9; ++i) {
            for(int j = 0; j < 9; ++j) {
                if(max <= matrix[i][j]) {
                    max = matrix[i][j];
                    row = i + 1;
                    column = j + 1;
                }
            }
        }
        return new int[]{max, row, column};
    }

    private static void printResult(int[] result) {
        System.out.println(result[0]);
        System.out.println(result[1] + " " + result[2]);
    }
}
