class Solution {
    public String solution(String s) {
        String answer = "";
        int i = 1;
        for (char c : s.toCharArray()) {
            if (c == ' ') {
                i = 1;
                answer += " ";
            } else {
                i ++;
                if (i % 2 == 0) answer += Character.toUpperCase(c);
                else answer += Character.toLowerCase(c);
            }
        }
        return answer;
    }
}