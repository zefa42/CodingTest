package BaekJoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Number_1213 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String name = br.readLine();

        int[] count = new int[26];
        for (char c : name.toCharArray()) {
            count[c - 'A']++;
        }

        // 홀수 개수 확인
        int oddCount = 0;
        int oddIndex = -1;
        for (int i = 0; i < 26; i++) {
            if (count[i] % 2 == 1) {
                oddCount++;
                oddIndex = i;
            }
        }

        // 홀수가 2개 이상이면 팰린드롬 불가능
        if (oddCount > 1) {
            System.out.println("I'm Sorry Hansoo");
            return;
        }

        StringBuilder left = new StringBuilder();
        StringBuilder right = new StringBuilder();
        String middle = "";

        // 왼쪽/오른쪽 생성
        for (int i = 0; i < 26; i++) {
            int half = count[i] / 2;
            for (int j = 0; j < half; j++) {
                left.append((char)(i + 'A'));
            }
        }

        // 가운데 문자(홀수일 때만)
        if (oddIndex != -1) {
            middle = String.valueOf((char)(oddIndex + 'A'));
        }

        // 오른쪽은 왼쪽을 뒤집은 것
        right.append(left).reverse();

        // 최종 문자열
        System.out.println(left.toString() + middle + right.toString());
    }
}
