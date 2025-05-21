import java.util.*;
import java.util.stream.*;

class Solution {
    public String solution(String number, int k) {
        Stack<Character> s = new Stack<>();
        
        for (char c : number.toCharArray()) {
            while (k > 0 && !s.isEmpty() && c > s.peek()) {
                s.pop();
                k--;
            }
            s.push(c);
        }
        
        while (k-- > 0) {
            s.pop();
        }
        
        return s.stream()
            .map(String::valueOf)
            .collect(Collectors.joining());
        
    }
}