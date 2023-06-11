class Solution {
    public int solution(String[] babbling) {
        int answer = 0;
        for (String str : babbling) {
            str = str.replaceAll("ayaaya|yeye|woowoo|mama", " ");
            str = str.replaceAll("aya|ye|woo|ma", "");
            if (str.length() == 0) answer++;
        }
        return answer;
    }
}