class Solution {
    public int solution(int[] schedules, int[][] timelogs, int startday) {
        int answer = 0;
        
        for (int i = 0; i < timelogs.length; i++) {
            if (isNotLateWorker(schedules[i], timelogs[i], startday)) {
                answer++;
            }
        }
        return answer;
    }
    
    public boolean isNotLateWorker(int startWorkTime, int[] workTimes, int startDay) {
        int day = startDay;
        for (int i = 0; i < 7; i++) {
            if (isHoliday(day++)) {
                continue;
            }
            if (!isSafeWorkTime(startWorkTime, workTimes[i])) {
                return false;
            };
        }
        
        return true;
    }
    
    private boolean isSafeWorkTime(int startWorkTime, int arriveTime) {
        int hour = startWorkTime / 100;
        int minute = startWorkTime % 100;
        
        minute += 10;
        
        if (minute >= 60) {
            hour += 1;
            minute -= 60;
        }
        
        return arriveTime <= (hour * 100 + minute);
    }
    
    private boolean isHoliday(int day) {
        return day % 7 == 6 || day % 7 == 0;
    }
}