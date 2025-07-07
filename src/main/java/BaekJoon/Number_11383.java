package BaekJoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Number_11383 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int[] size = Arrays.stream(bufferedReader.readLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();
        int N = size[0];
        int M = size[1];

        String[] saveOriginal = new String[N];
        for(int i = 0; i < N; ++i) {
            saveOriginal[i] = bufferedReader.readLine();
        }

        String[] saveDouble = new String[N];
        for(int i = 0; i < N; ++i) {
            saveDouble[i] = bufferedReader.readLine();
        }

        for(int i = 0; i < N; ++i) {
            for(int j= 0 ; j < M; ++j) {
                if(saveOriginal[i].charAt(j) != saveDouble[i].charAt(j * 2)
                        || (saveOriginal[i].charAt(j)) != saveDouble[i].charAt(j * 2 + 1)) {
                    System.out.println("Not Eyfa");
                    return;
                }
            }
        }
        System.out.println("Eyfa");

    }
}
