import java.util.*;

class Solution {
    public int[] solution(int[] progresses, int[] speeds) {
        int day = 0;
        List<Integer> result = new ArrayList<>();

        int count = 0;
        for (int i = 0; i < progresses.length; i ++) {    
            int feature = progresses[i];
            int speed = speeds[i];
            
            int remainProgress = 100 - feature - speed * day;
            if (remainProgress > 0 && count != 0) {
                result.add(count);
                count = 0;
            }
            if (remainProgress < 0) {
                count++;
                continue;
            }
            
            
            int needDay = remainProgress / speed;
            if (remainProgress % speed != 0) {
                needDay ++;
            }
            
            day += needDay;
            count++;
        }
        
        result.add(count);
        
        return result.stream().mapToInt(i -> i).toArray();
    }
}