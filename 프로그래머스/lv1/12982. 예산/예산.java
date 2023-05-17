import java.util.*;
class Solution {
    public int solution(int[] d, int budget) {
        int answer = 0;
        int cnt = 0;
        Arrays.sort(d);
        for (int i = 0; i < d.length; i++ ) {
            cnt += d[i];
            if (cnt > budget) {
                answer = i;
                break;
            }
        }
        if (cnt <= budget) answer = d.length;
        return answer;
    }
}