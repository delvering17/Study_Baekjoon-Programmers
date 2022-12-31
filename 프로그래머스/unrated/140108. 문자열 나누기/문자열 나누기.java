class Solution {
    public int solution(String str) {
        int answer = 0;
        int count = 0;
        int diff = 0;
        char first = str.charAt(0);
        for (int i = 0; i < str.length(); i++) {
            if (count == diff) {
                answer ++;
                first = str.charAt(i);
            }
            if (first == str.charAt(i)) count ++;
            else diff ++;
        } 
        return answer;
    }
}