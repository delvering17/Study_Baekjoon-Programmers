import java.util.*;

class Solution {
    public String solution(String[] survey, int[] choices) {
        Map<Character, Integer> map = new HashMap<>();
        
        for (int i = 0; i < survey.length; i ++) {
            char[] types = survey[i].toCharArray();
            int choice = choices[i];
            
            if (choice == 1) map.put(types[0], map.getOrDefault(types[0], 0) + 3);
            if (choice == 2) map.put(types[0], map.getOrDefault(types[0], 0) + 2);
            if (choice == 3) map.put(types[0], map.getOrDefault(types[0], 0) + 1);
            if (choice == 4) continue;
            if (choice == 5) map.put(types[1], map.getOrDefault(types[1], 0) + 1);
            if (choice == 6) map.put(types[1], map.getOrDefault(types[1], 0) + 2);
            if (choice == 7) map.put(types[1], map.getOrDefault(types[1], 0) + 3);
        }
        
        String result = "";
        result += selectType('R', 'T', map);
        result += selectType('C', 'F', map);
        result += selectType('J', 'M', map);
        result += selectType('A', 'N', map);
        
        return result;
    }
    
    private char selectType(char c1, char c2, Map<Character, Integer> map) {
        int i1 = map.getOrDefault(c1, 0);
        int i2 = map.getOrDefault(c2, 0);
        
        if (i1 == i2) return c1 <= c2 ? c1 : c2;
        if (i1 > i2) return c1;
        return c2; 
    }
}