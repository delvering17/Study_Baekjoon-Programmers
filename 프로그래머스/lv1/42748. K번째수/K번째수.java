import java.util.Arrays;

class Solution {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];
        for (int s = 0; s < commands.length; s++) {
            int[] arr = Arrays.copyOfRange(array, commands[s][0] - 1, commands[s][1]);
            Arrays.sort(arr);
            answer[s] = arr[commands[s][2]-1];
        }
        return answer;
    }
}