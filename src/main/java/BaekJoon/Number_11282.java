package BaekJoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Number_11282 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine().trim());   // 1 ≤ N ≤ 11172

        int codePoint = 0xAC00 + (N - 1);                 // '가' + (N-1)
        char syllable  = (char) codePoint;                // BMP 범위이므로 char 가능

        System.out.println(syllable);                     // UTF-8 표준 출력
    }
}
