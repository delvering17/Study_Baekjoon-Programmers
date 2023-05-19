import java.util.Arrays;

class Solution {
    public String[] solution(String[] strings, int n) {
        String[] answer = {};
        Arrays.sort(strings, (o1, o2) -> {
            int i = o1.charAt(n) - o2.charAt(n);
            if (i == 0) {
                return o1.compareTo(o2);
            }
            return i;
        });
        answer = strings;
        return answer;
    }
}