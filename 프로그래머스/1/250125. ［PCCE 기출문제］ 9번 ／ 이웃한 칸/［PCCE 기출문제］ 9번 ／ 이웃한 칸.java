class Solution {
    public int solution(String[][] board, int h, int w) {
        int[] dh = {1, 0, -1, 0};
        int[] dw = {0, 1, 0, -1};
        
        int result = 0;
        String targetColor = board[h][w];
        for (int i = 0; i < 4; i++) {
            int nh = h + dh[i];
            int nw = w + dw[i];

            if (nh < 0 || nh >= board.length || nw < 0 || nw >= board.length) {
                continue;
            }
            
            if (board[nh][nw].equals(targetColor)) {
                result ++;
            }
        }
        
        return result;
    }
}