import java.util.stream.Stream;
import java.util.Arrays;
import java.util.Comparator;

class Solution {
    public int solution(int k, int m, int[] score) {
        int answer = 0;
        Arrays.sort(score);
        for (int i = 0; i < score.length / m; i++) {
            int minPrice = score[score.length - (i + 1) * m];
            answer += minPrice * m;
        }

        return answer;
    }
}