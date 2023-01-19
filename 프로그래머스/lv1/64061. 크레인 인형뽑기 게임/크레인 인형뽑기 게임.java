import java.util.*;
class Solution {
    
    public int crane(int[][] board, int move) {
        for (int i = 0; i < board.length; i++) {
            int res = board[i][move - 1];
            if (res != 0) {
                board[i][move - 1] = 0;
                return res;
            }
        }
        return 0;
    }

    public boolean boom(Stack<Integer> s, int res) {
        if (s.empty()) {
            s.push(res);
            return false;
        } else {
            int con = s.peek();
            if (res == con) {
                s.pop();
                return true;
            } else {
                s.push(res);
                return false;
            }
        }
    }

    public int solution(int[][] board, int[] moves) {
        int answer = 0;
        Stack<Integer> s = new Stack<Integer>();

        for (int i = 0; i < moves.length; i++) {
            int res = crane(board, moves[i]);
            if (res != 0)
                if (boom(s, res)) {
                    answer += 2;
                }
        }
        return answer;
    }
}