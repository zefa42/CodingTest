package BaekJoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Queue;

public class Number_16928 {
    private static class State {
        int position;
        int count;

        public State(int position, int count) {
            this.position = position;
            this.count = count;
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int[] size = Arrays.stream(bufferedReader.readLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();
        int ladderSize = size[0];
        int snakeSize = size[1];

        int[] ladder = new int[101];
        for(int i = 1; i < 101; ++i) {
            ladder[i] = i;
        }

        // 사다리
        for(int i = 0; i < ladderSize; ++i) {
            int[] input = Arrays.stream(bufferedReader.readLine().split(" "))
                    .mapToInt(Integer::parseInt)
                    .toArray();
            ladder[input[0]] = input[1];
        }

        // 뱀
        for(int i = 0; i < snakeSize; ++i) {
            int[] input = Arrays.stream(bufferedReader.readLine().split(" "))
                    .mapToInt(Integer::parseInt)
                    .toArray();
            ladder[input[0]] = input[1];
        }

        boolean[] visited = new boolean[101];
        Queue<State> queue = new ArrayDeque<>();
        queue.offer(new State(1, 0));
        visited[1] = true;

        while(!queue.isEmpty()) {
            State cur = queue.poll();
            int curPosition = cur.position;
            int curCount = cur.count;

            if(curPosition == 100) {
                System.out.println(curCount);
                return;
            }
            for(int i = 1; i <= 6; ++i) {
                int next = curPosition + i;
                if(next > 100) {
                    continue;
                }
                next = ladder[next];
                if(!visited[next]) {
                    visited[next] = true;
                    queue.offer(new State(next, curCount + 1));
                }
            }
        }
    }
}
