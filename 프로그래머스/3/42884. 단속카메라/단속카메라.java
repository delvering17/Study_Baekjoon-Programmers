import java.util.*;

class Solution {
    public int solution(int[][] routes) {
        Arrays.sort(routes, Comparator.comparingInt(a -> a[1]));
        
        int beforeCamera = Integer.MIN_VALUE;
        int cameraCount = 0;
        for (int[] arr : routes) {
            if (arr[0] <= beforeCamera) {
                continue;
            }
            
            cameraCount++;
            beforeCamera = arr[1];
        }
        
        
        return cameraCount;
    }
}