import java.util.*;

class Solution {
    public int solution(int n, int[][] computers) {
        int answer = 0;
        
        boolean[] isVisited = new boolean[n];
        
        // computers iter
        for (int i = 0; i < n; i++) {
            if (isVisited[i]) continue;
            dfs(i, computers, isVisited);
            answer++;
        }
        
        return answer;
    }
    
    private void dfs(int computer, int[][] computers, boolean[] isVisited) {
        Stack<Integer> s = new Stack<>();
        s.push(computer);
        
        while (!s.isEmpty()) {
            int c = s.pop();
            
            if (isVisited[c]) continue;
            isVisited[c] = true;
            
            for (int i = 0; i < computers[c].length; i++) {
                if (computers[c][i] == 0) continue;
                s.push(i);
            }
            
        }

    }
    
    
}