class Solution {
    
    public int solution(int n, int m, int[] section) {
        int answer = 0;
        
        int[] canvas = new int[n];
        for (int i = 0; i < section.length; i++) {
            canvas[section[i]-1] = 1;
        }
        
        for (int i = 0; i < n; i++) {
            if (canvas[i] == 1) {
                answer ++;
                for (int j = 0; j < m; j++) {
                    if (i+j == n) break;
                    canvas[i+j] = 0;
                    if (j+1 == m) {
                        i = i + j;
                    }
                }
            }
        }
            
        return answer;
    }
}