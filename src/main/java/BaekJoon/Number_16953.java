package BaekJoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.Buffer;
import java.sql.SQLOutput;
import java.util.Arrays;

public class Number_16953 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int[] input = Arrays.stream(bufferedReader.readLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();
        int A = input[0];
        int B = input[1];

        int count = 1;
        while(B > A) {
            if(B % 10 == 1) {
                B /= 10;
            } else if(B % 2 == 0) {
                B /= 2;
            } else {
                break;
            }
            count++;
        }
        if(A == B) {
            System.out.println(count);
        } else {
            System.out.println("-1");
        }
    }

}
