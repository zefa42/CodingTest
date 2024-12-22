import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Number_2441 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        printStar(bufferedReader);
    }

    private static void printStar(BufferedReader bufferedReader) throws IOException {
        int size = Integer.parseInt(bufferedReader.readLine());
        for(int i = 0; i < size; ++i) {
            for(int j = 0; j < size; ++j) {
                if(i <= j) {
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}

