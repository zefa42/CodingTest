package BaekJoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Queue;

/*
1부터 100까지 번호가 매겨진 10 × 10 보드에서 주사위를 굴려 나온 눈만큼 말을 전진시키는 전통적인 가족 보드게임임.

어떤 칸에는 사다리가 있어 그 칸에 멈추면 더 큰 번호(위쪽) 칸으로 즉시 “점프”함.

어떤 칸에는 뱀이 있어 그 칸에 멈추면 더 작은 번호(아래쪽) 칸으로 “미끄러짐”.

먼저 100번 칸에 정확히 도달한 사람이 승리함.

-> “주사위를 마음대로 조작해서 100번 칸에 가장 빨리 도달하려면 ‘몇 번’ 던지면 될까?”

 */

public class Number_16928 {

    /**
     * BFS 노드를 표현하는 내부 클래스.
     * position : 현재 칸 번호
     * count    : 여기까지 주사위를 던진 횟수
     */
    private static class State {
        int position;
        int count;
        State(int position, int count) {
            this.position = position;
            this.count = count;
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        /* 사다리 수(N)와 뱀 수(M) 입력 */
        int[] nm = Arrays.stream(br.readLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();
        int ladderSize = nm[0];
        int snakeSize  = nm[1];

        /* board[i] = i 로 초기화 후, 사다리·뱀 정보로 덮어씀 */
        int[] board = new int[101];
        for (int i = 1; i <= 100; i++) board[i] = i;

        // 사다리 정보 입력 및 반영
        for (int i = 0; i < ladderSize; i++) {
            int[] io = Arrays.stream(br.readLine().split(" "))
                    .mapToInt(Integer::parseInt)
                    .toArray();
            board[io[0]] = io[1]; // x → y
        }

        // 뱀 정보 입력 및 반영
        for (int i = 0; i < snakeSize; i++) {
            int[] io = Arrays.stream(br.readLine().split(" "))
                    .mapToInt(Integer::parseInt)
                    .toArray();
            board[io[0]] = io[1]; // u → v
        }

        /* BFS 초기화 */
        boolean[] visited = new boolean[101];
        Queue<State> q = new ArrayDeque<>();
        q.offer(new State(1, 0)); // 시작: 1번 칸, 주사위 0회
        visited[1] = true;

        /* BFS 루프 */
        while (!q.isEmpty()) {
            State cur = q.poll();

            // 100번 칸 도달 → 답 출력 후 종료
            if (cur.position == 100) {
                System.out.println(cur.count);
                return;
            }

            // 주사위 눈 1~6 시뮬레이션
            for (int dice = 1; dice <= 6; dice++) {
                int next = cur.position + dice;
                if (next > 100) continue;      // 100 초과 시 이동 불가
                next = board[next];            // 사다리/뱀 이동 반영

                if (!visited[next]) {          // 최초 방문이면 큐 삽입
                    visited[next] = true;
                    q.offer(new State(next, cur.count + 1));
                }
            }
        }
    }
}
