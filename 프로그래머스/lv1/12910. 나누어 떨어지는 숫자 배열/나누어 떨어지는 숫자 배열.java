import java.util.*;
class Solution {
    public List solution(int[] arr, int divisor) {
        List arr2 = new ArrayList();
        for(int num : arr) {
            if(num % divisor == 0) {
                arr2.add(num);
            }
        }
        if(arr2.size() == 0) {
            arr2.add(-1);
        } else {
            Collections.sort(arr2);
        }
        return arr2;
    }
}