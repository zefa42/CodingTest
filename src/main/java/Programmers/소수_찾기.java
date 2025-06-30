package Programmers;

import java.util.*;

class 소수_찾기 {
    Set<Integer> primeSet;
    public int solution(String numbers) {
        primeSet = new HashSet<>();
        boolean[] visited = new boolean[numbers.length()];
        backtrack(numbers, visited, "");
        return primeSet.size();
    }

    public void backtrack(String numbers, boolean[] visited, String cur) {
        if(cur.length() != 0) {
            int num = Integer.parseInt(cur);
            if(isPrime(num)) {
                primeSet.add(num);
            }
        }
        for(int i = 0; i < numbers.length(); ++i) {
            if(!visited[i]) {
                visited[i] = true;
                backtrack(numbers, visited, cur + numbers.charAt(i));
                visited[i] = false;
            }
        }

    }

    public boolean isPrime(int num) {
        if(num < 2) {
            return false;
        }
        for(int i = 2; i <= Math.sqrt(num); ++i) {
            if(num % i == 0) {
                return false;
            }
        }
        return true;
    }
}