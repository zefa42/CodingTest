import java.util.Scanner;

public class Number_4806 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int lineCount = 0;

        // 입력이 있는 동안 줄을 읽음
        while (scanner.hasNextLine()) {
            scanner.nextLine(); // 한 줄 읽기
            lineCount++; // 줄 카운트 증가
        }

        // 줄의 개수 출력
        System.out.println(lineCount);

        scanner.close();
    }
}
