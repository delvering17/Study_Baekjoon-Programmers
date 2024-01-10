class Solution {
    public String solution(String str1, String str2) {
        String answer = "";
        char[] str1Array = str1.toCharArray();
        char[] str2Array = str2.toCharArray();
        for (int i = 0; i < str1Array.length; i++) {
            answer += str1Array[i];
            answer += str2Array[i];
        }
        return answer;
    }
}