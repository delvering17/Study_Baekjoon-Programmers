import java.util.*;

class Solution {
    
    private int[][] map = new int[104][104];
    
    public int solution(int[][] rectangle, int characterX, int characterY, int itemX, int itemY) {
        for (int i = 0; i < 104; i++) {
            Arrays.fill(map[i], 0);
        }
        
        for (int[] rect : rectangle) {
            int x1 = rect[0] * 2;
            int y1 = rect[1] * 2;
            int x2 = rect[2] * 2;
            int y2 = rect[3] * 2;

            for (int i = x1; i <= x2; i++) {
                map[i][y1] = 1;
                map[i][y2] = 1;
            }
            for (int j = y1; j <= y2; j++) {
                map[x1][j] = 1;
                map[x2][j] = 1;
            }
        }
        
        for (int[] rect : rectangle) {
            int x1 = rect[0] * 2;
            int y1 = rect[1] * 2;
            int x2 = rect[2] * 2;
            int y2 = rect[3] * 2;
            for (int i = x1 + 1; i < x2; i++) {
                for (int j = y1 + 1; j < y2; j++) {
                    map[i][j] = 0;
                }
            }
        }
        
        int[] dx = {1, -1, 0, 0};
        int[] dy = {0, 0, 1, -1};
        boolean[][] visited = new boolean[104][104];
        Queue<Point> queue = new LinkedList<>();
        queue.add(new Point(characterX * 2, characterY * 2, 0));
        visited[characterX * 2][characterY * 2] = true;
        
        while (!queue.isEmpty()) {
            Point p = queue.poll();
            if (p.x == itemX * 2 && p.y == itemY * 2) {
                return p.result / 2;
            }
            for (int i = 0; i < 4; i++) {
                int nx = p.x + dx[i];
                int ny = p.y + dy[i];
                if (nx < 0 || nx >= 104 || ny < 0 || ny >= 104) continue;
                if (visited[nx][ny]) continue;
                if (map[nx][ny] == 0) continue;
                visited[nx][ny] = true;
                queue.add(new Point(nx, ny, p.result + 1));
            }
        }
        
        return -1;
    }
    
    static class Point {
        int x, y, result;
        public Point(int x, int y, int result) {
            this.x = x;
            this.y = y;
            this.result = result;
        }
    }
}
