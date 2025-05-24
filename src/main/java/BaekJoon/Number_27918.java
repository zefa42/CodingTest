package BaekJoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Number_27918 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int dScore = 0, pScore = 0;

        for (int i = 0; i < N; i++) {
            String winner = br.readLine();
            if (winner.charAt(0) == 'D') {
                dScore++;
            } else {
                pScore++;
            }
            // 누군가가 2점 차로 앞서면 경기 종료
            if (Math.abs(dScore - pScore) >= 2) {
                break;
            }
        }

        System.out.println(dScore + ":" + pScore);
        br.close();
    }
}
