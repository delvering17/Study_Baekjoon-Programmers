import java.util.*;

class Solution {
    public int[] solution(int m, int n, int[][] picture) {
        boolean[][] isVisited = new boolean[101][101];
        int[] dx = {1, 0, -1, 0}; // x: 가로
        int[] dy = {0, 1, 0, -1}; // y: 세로
        
        int count = 0;
        int max = 0;

        for (int i = 0; i < m; i++) { // y
            for (int j = 0; j < n; j++) { // x
                if (isVisited[i][j]) continue;
                if (picture[i][j] == 0) continue;
                
                count++;
                int tempMax = 1;
                int color = picture[i][j];

                Stack<Point> s = new Stack<>();
                s.push(new Point(j, i)); // x, y로 전달
                isVisited[i][j] = true;

                while (!s.isEmpty()) {
                    Point point = s.pop();

                    for (int k = 0; k < 4; k++) {
                        int nx = point.x + dx[k];
                        int ny = point.y + dy[k];

                        if (nx < 0 || nx >= n || ny < 0 || ny >= m) continue;
                        if (isVisited[ny][nx]) continue;
                        if (picture[ny][nx] == 0) continue;
                        if (picture[ny][nx] != color) continue;

                        tempMax++;
                        isVisited[ny][nx] = true;
                        s.push(new Point(nx, ny));
                    }
                }

                max = Math.max(max, tempMax);
            }
        }

        return new int[]{count, max};
    }

    private static class Point {
        public final int x;
        public final int y;

        public Point(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }
}
