import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

class Main {

    static int[] dx = {1, 0, -1, 0};
    static int[] dy = {0, 1, 0, -1};
    static int[][] board = new int[102][102];
    static int[][] vis = new int[102][102];

    public static void main(String[ ] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        for (int i = 0; i < n; i++) {
            String[] split = sc.next().split("");
            for (int j = 0; j < m; j++) {
                board[i][j] = Integer.parseInt(split[j]);
            }
        }

        Queue<Pair> q = new LinkedList<>();
        q.add(new Pair(0, 0));
        vis[0][0] = 1;
        while(!q.isEmpty()) {
            Pair cur = q.poll();
            if (cur.x + 1 == n && cur.y + 1 == m ) {
                System.out.println(vis[cur.x][cur.y]);
                break;
            }
            for (int i = 0; i < 4; i++) {
                int nx = cur.x + dx[i];
                int ny = cur.y + dy[i];
                if (nx >= n || nx < 0 || ny >= m || ny < 0) continue;
                if (board[nx][ny] == 0 || vis[nx][ny] > 0) continue;
                q.add(new Pair(nx, ny));
                vis[nx][ny] = vis[cur.x][cur.y] + 1;
            }
        }
    }

}
class Pair {
    int x, y;
    public Pair(int x, int y) {
        this.x = x;
        this.y = y;
    }
}
