import java.time.LocalDate;

class Solution {
    public String solution(int a, int b) {
        String answer = "";
        String[] dayList = {"MON", "TUE", "WED", "THU", "FRI", "SAT", "SUN"};
        answer = dayList[LocalDate.of(2016, a, b).getDayOfWeek().getValue()-1];
        return answer;
    }
}