import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Number_10995 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        printStar(createStar(bufferedReader));
    }

    private static int[][] createStar(BufferedReader bufferedReader) throws IOException {
        int size = Integer.parseInt(bufferedReader.readLine());
        int[][] star = new int[size * 2][size * 2];
        for(int i = 0; i < size; ++i) {
            for(int j = 0; j < size * 2; ++j) {
                if(i % 2 == 0 && j % 2 == 0) {
                    star[i][j] = 1;
                }
                else if(i % 2 != 0 && j % 2 != 0) {
                    star[i][j] = 1;
                }
            }
        }
        return star;
    }

    private static void printStar(int[][] star) {
        for(int i = 0; i < (star[0].length / 2); ++i) {
            for(int j = 0; j < (star[i].length); ++j) {
                if(star[i][j] == 1) {
                    System.out.print("*");
                }
                else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
