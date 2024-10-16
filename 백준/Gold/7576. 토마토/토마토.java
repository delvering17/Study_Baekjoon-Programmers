import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt(); // 열 (가로)
        int n = sc.nextInt(); // 행 (세로)

        int[] dx = {1, 0, -1, 0};
        int[] dy = {0, 1, 0, -1};
        int[][] distance = new int[n][m];

        Queue<Pair> queue = new LinkedList<>();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                int num = sc.nextInt();
                if (num == 1) {
                    queue.add(new Pair(i, j));
                }
                if (num == 0) {
                    distance[i][j] = -1;
                }
            }
        }


        while (!queue.isEmpty()) {
            Pair cur = queue.poll();
            for (int i = 0; i < 4; i++) {
                int nx = cur.x + dx[i];
                int ny = cur.y + dy[i];

                if (nx < 0 || nx >= n || ny < 0 || ny >= m) continue;
                if (distance[nx][ny] >= 0) continue;

                distance[nx][ny] = distance[cur.x][cur.y] + 1;
                queue.add(new Pair(nx, ny));
            }
        }
        int answer = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (distance[i][j] == -1) {
                    System.out.println(-1);
                    return;
                }

                answer = Math.max(answer, distance[i][j]);
            }
        }
        System.out.println(answer);
    }

    public static class Pair {
        int x;
        int y;

        public Pair(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }

}