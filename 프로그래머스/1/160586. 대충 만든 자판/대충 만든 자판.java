import java.util.*;

class Solution {
    public int[] solution(String[] keymap, String[] targets) {
        Map<Character, Integer> map = new HashMap<>();
        setKeybordMap(map, keymap);
        
        int[] answer = new int[targets.length];
        for (int i = 0; i < targets.length; i++) {
            String target = targets[i];
            answer[i] = calculatePushCount(map, target);
        }
        
        return answer;
    }
    
    private int calculatePushCount(Map<Character, Integer> map, String target) {
        int count = 0;
        char[] arr = target.toCharArray();
        for (char c : arr) {
            if (!map.containsKey(c)) {
                return -1;
            }
            count += map.get(c);
        }
            
        return count;
    } 
    
    private void setKeybordMap(Map<Character, Integer> map, String[] keymap) {
        for (String str : keymap) {
            char[] arr = str.toCharArray();
            for (int i = 0; i < arr.length; i++) {
                addKeyCount(map, arr[i], i + 1);
            }
        }
        
    }
    
    private void addKeyCount(Map<Character, Integer> map, char c, int count) {
        Integer findKeyCount = map.get(c);
        if (findKeyCount == null) {
            map.put(c, count);
            return;
        }
        
        map.put(c, Math.min(findKeyCount, count));
    }
}