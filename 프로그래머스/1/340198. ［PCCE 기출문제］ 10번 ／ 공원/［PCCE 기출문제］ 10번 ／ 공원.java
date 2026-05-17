import java.util.*;

class Solution {
    
    public int solution(int[] mats, String[][] park) {
        Arrays.sort(mats);
        int answer = -1;
        
        int[][] board = new int[park.length][park[0].length];
        
        for (int i = 0; i < park.length; i++) {
            for (int j = 0; j < park[0].length; j++) {
                String str = park[i][j];
                if (!str.equals("-1")) {
                    board[i][j] = 0;
                    continue;
                }
                
                if (i == 0 || j == 0) {
                    board[i][j] = 1;
                    answer = Math.max(answer, getMats(mats, 1));
                    continue;
                }
                
                int topLeft = board[i-1][j-1];
                int top = board[i-1][j];
                int left = board[i][j-1];
                int size = Math.min(topLeft, Math.min(top, left)) + 1;
                board[i][j] = size;
                answer = Math.max(answer, getMats(mats, size));
            }
        }
        
        
        return answer;
    }
    
    public int getMats(int[] mats, int size) {
        int candidateMat = -1;
        for (int i = 0; i < mats.length; i++) {
            if (mats[i] > size) {
                return candidateMat;
            }
            
            candidateMat = mats[i];
        }
        
        return candidateMat;
    }
    
    
}