import java.util.*;
import java.util.stream.*;

class Solution {
    public int solution(int k, int[] tangerine) {
        int count = 0;
        
        List<Long> list = Arrays.stream(tangerine)
            .boxed()
            .collect(Collectors.groupingBy(n -> n, Collectors.counting()))
            .values()
            .stream()
            .sorted(Comparator.reverseOrder())
            .toList();
        
        for (int i = 0; i < list.size(); i++) {
            Long n = list.get(i);
            
            k -= n;
            count ++;
            
            if (k <= 0) {
                break;
            }
        }
        
        return count;
    }
}