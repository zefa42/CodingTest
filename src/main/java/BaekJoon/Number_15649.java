import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Number_15649 {
    static int N, M;
    static int[] save;
    static boolean[] used;

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int[] input = Arrays.stream(bufferedReader.readLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        N = input[0];
        M = input[1];
        save = new int[M];
        used = new boolean[N + 1]; // 이미 사용된 숫자를 기록하는 배열. 예: 크기가 5인 배열

        backtrack(0);
    }

    private static void backtrack(int depth) {
        if(depth == M) {
            // 숫자를 M개 다 골랐을 때, 배열 save에 저장된 숫자들을 출력
            for(int i = 0; i < depth; ++i) {
                System.out.print(save[i] + " ");
            }
            System.out.println();
            return;
        }

        // 1부터 N까지 숫자들을 하나씩 시도해봐
        for(int i = 1; i <= N; ++i) {
            if(!used[i]) { // 아직 숫자 i를 안 썼다면:
                used[i] = true;       // 숫자 i를 사용했음을 기록해.
                save[depth] = i;      // 현재 depth(위치)에 숫자 i를 넣어.
                backtrack(depth + 1); // 다음 숫자를 고르러 가! 이때 depth는 1 증가해.

                // 탐험이 끝났으니까 숫자 i를 다시 사용하지 않은 것으로 표시해줘야 해.
                used[i] = false;
            }
        }
    }
}
