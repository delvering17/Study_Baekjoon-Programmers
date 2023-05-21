class Solution {
    public int solution(int a, int b, int n) {
        int answer = 0;
        while (n / a > 0) {
            int save = (n / a) * b;
            answer += save;
            n = save + n % a;
        }
        return answer;
    }
}