class Solution {
    public int[] solution(int n) {
        int[][] triangle = new int[n][n];
        int v = 1;

        int x = 0;
        int y = 0;

        while (true) {
            while (true) {
                triangle[y][x] = v ++;
                if (y + 1 == n || triangle[y + 1][x] != 0) break;
                y ++;
            }

            if (x + 1 == n || triangle[y][x + 1] != 0) break;
            x ++;

            while (true) {
                triangle[y][x] = v ++;
                if (x + 1 == n || triangle[y + 1][x] != 0) break;
                x ++;
            }

            if (triangle[y - 1][x - 1] != 0) break;
            x --;
            y --;

            while (true) {
                triangle[y][x] = v ++;
                if (triangle[y - 1][x - 1] != 0) break;
                x --;
                y --;
            }

            if (y + 1 == n || triangle[y + 1][x] != 0) break;
            y ++;
        }

        int[] result = new int[v - 1];
        int index = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                result[index++] = triangle[i][j];
            }
        }

        return result;
    }
}