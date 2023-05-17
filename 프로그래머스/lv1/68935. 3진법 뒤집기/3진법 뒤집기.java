class Solution {
    public int solution(int n) {
        int answer = 0;
        String str = new StringBuilder(Integer.toString(n, 3)).reverse().toString();
        answer = Integer.parseInt(str, 3);
        return answer;
    }
}