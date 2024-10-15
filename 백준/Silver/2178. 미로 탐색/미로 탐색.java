import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] board = new int[n][m];
        int[][] distance = new int[n][m];
        int[] dx = {1, 0, -1, 0};
        int[] dy = {0, 1, 0, -1};

        for (int i = 0; i < n; i++) {
            String[] split = sc.next().split("");
            for (int j = 0; j < m; j++) {
                board[i][j] = Integer.parseInt(split[j]);
            }
        }

        distance[0][0] = 1;
        Queue<Pair> q = new LinkedList<>();
        q.add(new Pair(0, 0));

        while (!q.isEmpty()) {
            Pair cur = q.poll();

            for (int i = 0; i < 4; i++) {
                int nx = cur.x + dx[i];
                int ny = cur.y + dy[i];

                if (nx < 0 || nx >= n || ny <0 || ny >= m) continue;
                if (distance[nx][ny] >= 1 || board[nx][ny] == 0) continue;

                distance[nx][ny] = distance[cur.x][cur.y] + 1;
                q.add(new Pair(nx, ny));
            }
        }

        System.out.println(distance[n-1][m-1]);
    }

    public static class Pair {
        public int x;
        public int y;

        public Pair(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }
}