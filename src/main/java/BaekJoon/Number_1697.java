package BaekJoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class Number_1697 {
    public static void main(String[] args) throws IOException {
        //수빈이는 동생과 숨바꼭질을 하고 있다. 수빈이는 현재 점 N(0 ≤ N ≤ 100,000)에 있고, 동생은 점 K(0 ≤ K ≤ 100,000)에 있다.
        // 수빈이는 걷거나 순간이동을 할 수 있다. 만약, 수빈이의 위치가 X일 때 걷는다면 1초 후에 X-1 또는 X+1로 이동하게 된다.
        // 순간이동을 하는 경우에는 1초 후에 2*X의 위치로 이동하게 된다.
        //수빈이와 동생의 위치가 주어졌을 때, 수빈이가 동생을 찾을 수 있는 가장 빠른 시간이 몇 초 후인지 구하는 프로그램을 작성하시오.
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int[] input = Arrays.stream(bufferedReader.readLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();
        int su = input[0];
        int bro = input[1];

        int[] visited = new int[100001];
        Arrays.fill(visited, -1);

        Queue<Integer> queue = new LinkedList<>();
        queue.offer(su);
        visited[su] = 0;


        while(!queue.isEmpty()) {
            int cur = queue.poll();


            int[] calculate = {cur - 1, cur + 1, cur * 2};
            for(int next : calculate) {
                if(next >= 0 && next < 100001 && visited[next] == -1) {
                    visited[next] = visited[cur] + 1;
                    queue.offer(next);
                    if(next == bro) {
                        System.out.println(visited[next]);
                        return;
                    }
                }
            }
        }
    }
}
