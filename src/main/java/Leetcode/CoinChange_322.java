package Leetcode;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Set;

class CoinChange_322 {
    public int coinChange(int[] coins, int amount) {
        Set<Integer> visited = new HashSet<>();
        Queue<int[]> queue = new LinkedList<>();

        // 초기 상태: 남은 금액, 동전 수
        queue.offer(new int[] {amount, 0});
        visited.add(amount);

        while(!queue.isEmpty()) {
            int[] current = queue.poll();
            int remaining = current[0];
            int coinCount = current[1];

            // 금액을 맞춘 경우
            if(remaining == 0) {
                return coinCount;
            }

            // 가능한 동전으로 다음 상태 탐색
            for(int coin : coins) {
                int next = remaining - coin;
                if(next >= 0 && !visited.contains(next)) {
                    queue.offer(new int[]{next, coinCount + 1});
                    visited.add(next);
                }
            }
        }
        return -1;
    }
}