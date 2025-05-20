import java.util.*;

class Solution {
    public int solution(int[][] maps) {
     
        int[] dx = {1, -1, 0, 0};
        int[] dy = {0, 0, 1, -1};
        int n = maps.length;
        int m = maps[0].length;
        boolean[][] isVisited = new boolean[maps.length][maps[0].length];
        Queue<State> queue = new LinkedList<>();
        queue.add(new State(0, 0, 1));
        
        while (!queue.isEmpty()) {
            State state = queue.poll();
            
            for (int dir = 0; dir < 4; dir++) {
                int nx = state.x + dx[dir];
                int ny = state.y + dy[dir];
            
                if (nx < 0 || nx > n-1 || ny < 0 || ny > m-1) continue;
                if (isVisited[nx][ny]) continue;
                if (maps[nx][ny] == 0) continue;
                
                if (nx == n-1 && ny == m-1) {
                    return state.result + 1;
                } 
                
                isVisited[nx][ny] = true;
                queue.add(new State(nx, ny, state.result + 1));
            }
            
        }
        
        
        return -1;
    }
    
    private static class State {
        public final int x;
        public final int y;
        public final int result;
        
        private State(int x, int y, int result) {
            this.x = x;
            this.y = y;
            this.result = result;
        }
    }
}