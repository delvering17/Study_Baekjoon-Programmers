import java.util.Arrays;

class Solution {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];
        for (int i = 0; i < commands.length; i++) {
            answer[i] = getNumber(array, commands[i]);
        }
        
        return answer;
    }
    
    private int getNumber(int[] array, int[] command) {
        int startIndex = command[0] - 1;
        int endIndex = command[1];
        int targetIndex = command[2] - 1;
        
        int[] slicedArray = slice(array, startIndex, endIndex);
        
        sort(slicedArray);
        
        return slicedArray[targetIndex];
    }
    
    private int[] slice(int[] array, int startIndex, int endIndex) {
        return Arrays.copyOfRange(array, startIndex, endIndex);
    }
    
    private void sort(int[] array) {
        Arrays.sort(array);
    }
    
}