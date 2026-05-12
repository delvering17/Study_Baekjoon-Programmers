class Solution {

    public int[] solution(String[] wallpaper) {
        int[] answer = {};
        int lux = -1, luy = -1, rdx = -1, rdy = 0;
        String[][] board = getBoard(wallpaper);
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                if (board[i][j].equals("#")) {
                    if (luy == -1 || luy > j) {
                        luy = j;
                    }
                    if (lux == -1) {
                        lux = i;
                    }
                    if (rdy == -1 || rdy < j) {
                        rdy = j;
                    }
                    if (rdx < i) {
                        rdx = i;
                    }

                }
            }
        }

        return new int[]{lux, luy, rdx+1, rdy+1};
    }

    private String[][] getBoard(String[] wallpaper) {
        String[][] board = new String[wallpaper.length][wallpaper[0].length()];
        for (int i = 0; i < wallpaper.length; i++) {
            board[i] = wallpaper[i].split("");
        }

        return board;
    }
}