class Solution {
    public String solution(String n_str) {
        String answer = "";
        boolean trim = false;
        for (char c : n_str.toCharArray()) {
            if (!trim && c == '0') {
                continue;
            }
            
            trim = true;
            answer += c;
        }
        return answer;
    }
}