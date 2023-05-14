import java.util.*;

public class Solution {
    public ArrayList<Integer> solution(int [] arr) {
        ArrayList<Integer> answer = new ArrayList<>();
        int save = -1;
        for (int num : arr) {
            if (num != save) {
                save = num;
                answer.add(num);
            }
        }
        return answer;
    }
}