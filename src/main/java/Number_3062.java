import java.util.Scanner;

public class Number_3062 {

    public static int reverse(int num) {
        int reversed = 0;
        while (num > 0) {
            reversed = reversed * 10 + (num % 10);
            num /= 10;
        }
        return reversed;
    }

    public static boolean isPalindrome(int num) {
        String str = Integer.toString(num);
        int len = str.length();
        for (int i = 0; i < len / 2; i++) {
            if (str.charAt(i) != str.charAt(len - 1 - i)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int T = scanner.nextInt(); // 테스트 케이스 개수
        for (int t = 0; t < T; t++) {
            int N = scanner.nextInt();
            int reversedN = reverse(N);
            int sum = N + reversedN;

            if (isPalindrome(sum)) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }

        scanner.close();
    }
}
