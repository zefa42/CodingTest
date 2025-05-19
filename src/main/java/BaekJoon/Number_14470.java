import java.util.Scanner;

public class Number_14470 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 입력 받기
        int A = scanner.nextInt(); // 초기 온도
        int B = scanner.nextInt(); // 목표 온도
        int C = scanner.nextInt(); // 얼어 있는 고기 1℃ 가열 시간
        int D = scanner.nextInt(); // 해동 시간
        int E = scanner.nextInt(); // 얼어 있지 않은 고기 1℃ 가열 시간

        long totalTime = 0;

        // 초기 온도가 0℃ 미만일 경우 (얼어 있음)
        if (A < 0) {
            // -A℃에서 0℃까지 가열
            totalTime += (long) C * Math.abs(A);
            // 해동 시간
            totalTime += D;
            // 0℃에서 B℃까지 가열
            totalTime += (long) E * B;
        }
        // 초기 온도가 0℃일 경우
        else if (A == 0) {
            // 해동 시간
            totalTime += D;
            // 0℃에서 B℃까지 가열
            totalTime += (long) E * B;
        }
        // 초기 온도가 0℃ 초과일 경우 (얼어 있지 않음)
        else {
            // A℃에서 B℃까지 가열
            totalTime += (long) E * (B - A);
        }

        // 결과 출력
        System.out.println(totalTime);

        scanner.close();
    }
}