package Programmers;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Set;

public class 단어_변환 {
    public int solution(String begin, String target, String[] words) {
        boolean exist = false;
        for(String word : words) {
            if (target.equals(word)) {
                exist = true;
                break;
            }
        }
        if(!exist) return 0;

        Queue<Word> queue = new LinkedList<>();
        queue.offer(new Word(begin, 0));
        Set<String> visited = new HashSet<>();
        visited.add(begin);
        while(!queue.isEmpty()) {
            Word cur = queue.poll();
            String curString = cur.word;
            int curCount = cur.count;

            if(curString.equals(target)) {
                return curCount;
            }

            for(String word : words) {
                if(isDifferentOnlyOneLetter(curString, word) && !visited.contains(word)) {
                    queue.offer(new Word(word, curCount + 1));
                    visited.add(word);
                }
            }
        }
        return 0;
    }

    private boolean isDifferentOnlyOneLetter(String word1, String word2) {
        int differentCount = 0;
        for(int i = 0; i < word1.length(); ++i) {
            if(word1.charAt(i) != word2.charAt(i)) differentCount++;
        }
        return (differentCount == 1);
    }

    private static class Word {
        String word;
        int count;
        public Word(String word, int count) {
            this.word = word;
            this.count = count;
        }
    }
}

