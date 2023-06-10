import java.util.*;
class Solution {
    public int solution(int[] ingredients) {
        int answer = 0;
        Stack<Integer> s = new Stack<>();
        for (int ingredient : ingredients) {
            s.push(ingredient);
            if (s.size() >= 4) {
                if (s.get(s.size()-1) == 1 &&
                    s.get(s.size()-2) == 3 &&
                    s.get(s.size()-3) == 2 &&
                    s.get(s.size()-4) == 1) {
                    answer ++;
                    s.pop();
                    s.pop();
                    s.pop();
                    s.pop();
                }
            }
        }
        return answer;
    }
}