class Solution {
    public String solution(String s, int n) {
        String answer = "";
        for (char c : s.toCharArray()) {
            if (c == ' ') {
                answer += " ";
                continue;
            }
            char save = (char) (c + n);
            if ((Character.isUpperCase(c) && save > 90) ||
                (Character.isLowerCase(c) && save > 122)) {
                save = (char) (save - 26);
            }
            answer += save;
        }
        return answer;
    }
}