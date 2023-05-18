class Solution {
    static int cnt = 0;
    public void dfs(int l, int d, int sum, int[] arr) {
        if (l == 4 ) {
            if (sum == 0) cnt ++;
        } else if (d == arr.length) {
        } else {
            dfs(l + 1, d + 1, sum + arr[d], arr);
            dfs(l, d + 1, sum, arr);
        }
    }

    public int solution(int[] number) {
        int answer = 0;
        dfs(1, 0, 0, number);
        answer = cnt;
        return answer;
    }
}