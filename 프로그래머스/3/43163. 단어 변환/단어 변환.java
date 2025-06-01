import java.util.*;

class Solution {
    public int solution(String begin, String target, String[] words) {
        if (!Arrays.asList(words).contains(target)) return 0;

        Queue<Word> queue = new LinkedList<>();
        boolean[] visited = new boolean[words.length];

        queue.add(new Word(begin, 0)); 

        while (!queue.isEmpty()) {
            Word current = queue.poll();
            String word = current.word;
            int depth = current.depth;

            if (word.equals(target)) return depth;

            for (int i = 0; i < words.length; i++) {
                if (!visited[i] && canConvert(word, words[i])) {
                    visited[i] = true;
                    queue.add(new Word(words[i], depth + 1));
                }
            }
        }

        return 0; 
    }

    private boolean canConvert(String a, String b) {
        int diff = 0;
        for (int i = 0; i < a.length(); i++) {
            if (a.charAt(i) != b.charAt(i)) diff++;
            if (diff > 1) return false;
        }
        return diff == 1;
    }

    class Word {
        String word;
        int depth;

        Word(String word, int depth) {
            this.word = word;
            this.depth = depth;
        }
    }
}
