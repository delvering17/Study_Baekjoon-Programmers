import java.util.*;

class Solution {
    public int solution(String begin, String target, String[] words) {
        boolean[] isVisited = new boolean[words.length];
        
        Queue<State> queue = new LinkedList<>();
        queue.add(new State(begin, 0));
        
        while (!queue.isEmpty()) {
            State state = queue.poll();
            
            if (state.word.equals(target)) {
                return state.step;
            }
            
            for (int i = 0; i < words.length; i++) {
                String next = words[i];
                
                if (!isValidWord(state.word, next)) {
                    continue;
                }
                
                if (isVisited[i]) {
                    continue;
                }
                
                isVisited[i] = true;
                queue.add(new State(next, state.step + 1));
                
            }
            
        }
        
        return 0;
    }
    
    private static class State {
        public final String word;
        public final int step;
        
        private State(String word, int step) {
            this.word = word;
            this.step = step;
        }
        
    }
    
    private boolean isValidWord(String s1, String s2) {
        char[] arr1 = s1.toCharArray();  
        char[] arr2 = s2.toCharArray();
        
        int diff = 0;
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] != arr2[i]) {
                diff ++;
            }
        }
        
        return diff == 1;
    }
    
}