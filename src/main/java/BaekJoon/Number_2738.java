import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Number_2738 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String[] rowAndColumn = bufferedReader.readLine().split(" ");
        validateNull(rowAndColumn);
        int row = Integer.parseInt(rowAndColumn[0]);
        int column = Integer.parseInt(rowAndColumn[1]);
        validateMatrixLength(row, column);
        printMatrix(addMatrix(createMatrix(bufferedReader, row, column), (createMatrix(bufferedReader, row, column))));
    }

    private static int[][] createMatrix(BufferedReader bufferedReader, int row, int column) throws IOException {
        int[][] matrix = new int[row][column];
        for(int i = 0; i < row; ++i) {
            String[] tmp = (bufferedReader.readLine().split(" "));
            for(int j = 0; j < column; ++j) {
                validateElementSize(Integer.parseInt(tmp[j]));
                matrix[i][j] = Integer.parseInt(tmp[j]);
            }
        }
        return matrix;
    }

    private static int[][] addMatrix(int[][] first, int[][] second) {
        int[][] result = new int[first.length][first[0].length];
        for(int i = 0; i < first.length; ++i) {
            for(int j = 0; j < first[0].length; ++j) {
                result[i][j] = first[i][j] + second[i][j];
            }
        }
        return result;
    }

    private static void printMatrix(int[][] result) {
        for(int i = 0; i < result.length; ++i) {
            for(int j = 0; j < result[0].length; ++j) {
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }
    }

    private static void validateNull(String[] input) {
        for(String str : input) {
            if(str == null || str.isBlank()) {
                throw new IllegalArgumentException();
            }
        }
    }

    private static void validateMatrixLength(int row, int column) {
        if(row > 100 || row < 1 || column > 100 || column < 1) {
            throw new IllegalArgumentException();
        }
    }

    private static void validateElementSize(int element) {
        if(element > 100) {
            throw new IllegalArgumentException();
        }
    }
}
