import java.util.*;
import java.util.stream.*;

class Solution {
    public int[][] solution(int[][] data, String ext, int val_ext, String sort_by) {
        Map<String, Integer> propertyMap = getPropertyMap();
        
        int[][] filteredDataArr = filter(data, ext, val_ext);
        sort(filteredDataArr, sort_by);
        return filteredDataArr;
    }
    
    private void sort(int[][] data, String sortProperty) {
        Map<String, Integer> propertyMap = getPropertyMap();
        int propertyOrder = propertyMap.get(sortProperty);
        
        Arrays.sort(data, (a, b) -> Integer.compare(a[propertyOrder],b[propertyOrder]));
    }
    
    private int[][] filter(int[][] data, String property, int value) {
        Map<String, Integer> propertyMap = getPropertyMap();
        int propertyOrder = propertyMap.get(property);
        
        return Arrays.stream(data)
            .filter(d -> d[propertyOrder] < value)
            .toArray(int[][]::new);
    }
    
    private Map<String, Integer> getPropertyMap() {
        Map<String, Integer> map = new HashMap<>();
        map.put("code", 0);
        map.put("date", 1);
        map.put("maximum", 2);
        map.put("remain", 3);
        
        return map;
    }
    
}