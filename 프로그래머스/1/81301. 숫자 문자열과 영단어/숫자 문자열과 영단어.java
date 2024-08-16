import java.util.Map;

class Solution {
    
    private final Map<String, String> numWordMatchMap = Map.of(
        "zero", "0",	
        "one", "1",	
        "two", "2",	
        "three", "3",	
        "four", "4",	
        "five", "5",	
        "six", "6",	
        "seven", "7",	
        "eight", "8",	
        "nine", "9"
    );
    
    public int solution(String s) {
        int answer = 0;
        
        for (Map.Entry<String, String> entrySet : numWordMatchMap.entrySet()) {
            s = s.replaceAll(entrySet.getKey(), entrySet.getValue());
        }
        
        return Integer.parseInt(s);
    }
}