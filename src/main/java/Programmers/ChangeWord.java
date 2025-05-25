package Programmers;

import java.util.*;

public class ChangeWord {
    public int solution(String begin, String target, String[] words) {
        return bfs(begin, target, words);
    }

    private static int differentCount(String str1, String str2) {
        int count = 0;
        for(int i = 0; i < str1.length(); ++i) {
            if(str1.charAt(i) != str2.charAt(i)) {
                count++;
            }
        }
        return count;
    }

    private static int bfs(String begin, String target, String[] words) {
        Queue<Word> queue = new ArrayDeque<>();
        Set<String> visited = new HashSet<>();
        queue.offer(new Word(begin, 0));
        visited.add(begin);

        while(!queue.isEmpty()) {
            Word current = queue.poll();
            String str = current.str;
            int count = current.count;

            if(str.equals(target)) {
                return count;
            }

            for(String nextWord : words) {
                if(!visited.contains(nextWord) && differentCount(str, nextWord) == 1) {
                    queue.offer(new Word(nextWord, count + 1));
                    visited.add(nextWord);
                }
            }
        }
        return 0;
    }

    private static class Word {
        String str;
        int count;

        public Word(String str, int count) {
            this.str = str;
            this.count = count;
        }
    }
}
