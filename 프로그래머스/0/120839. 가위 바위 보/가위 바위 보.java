import java.util.stream.Collectors;

class Solution {
    
    public String solution(String rsp) {
        return rsp.chars()
            .mapToObj(ch -> ch == '2' ? "0" : ch == '0' ? "5" : "2")
            .collect(Collectors.joining());
    }
}