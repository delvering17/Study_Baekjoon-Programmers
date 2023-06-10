class Solution {
    public int solution(int[] ingredients) {
        int answer = 0;
        int frontIngred = 0;
        for (int ingred : ingredients) {
            if (frontIngred == ingred) continue;
            if (frontIngred == ingred - 1) {
                if (ingred == 3) {
                    answer ++;
                    frontIngred = 0;
                } else {
                    frontIngred = ingred;
                }
            } else {
                frontIngred = 0;
            }
        }
        return answer;
    }
}