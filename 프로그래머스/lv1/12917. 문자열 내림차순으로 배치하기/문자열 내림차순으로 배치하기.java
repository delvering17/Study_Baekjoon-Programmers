class Solution {
    public String solution(String s) {
        String answer = "";
        int[] save = new int[123];
        char[] arr = s.toCharArray();
        for (char c : arr) {
            save[c]++;
        }
        for (int i = 122; i >= 65; i--) {
            while (save[i]-- != 0) {
                answer += (char) i;
            }
        }
        return answer;
    }
}