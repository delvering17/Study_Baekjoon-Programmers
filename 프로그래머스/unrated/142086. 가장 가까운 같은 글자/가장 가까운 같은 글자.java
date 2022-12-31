import java.util.Arrays;
class Solution {

    public int[] solution(String s) {
        int[] save = new int[26];
        Arrays.fill(save, -1);
        int[] answer = new int[s.length()];
        char[] arr = s.toCharArray();
        for (int i = 0; i < s.length(); i++) {
            if (save[arr[i]-97] == -1) {
                answer[i] = -1;
                save[arr[i]-97] = i;
            }
            else {
                answer[i] = i - save[arr[i]-97];
            }
            save[arr[i]-97] = i;
        }
        return answer;
    }
}