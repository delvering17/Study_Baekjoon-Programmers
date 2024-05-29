class Solution {
    public int[] solution(int[] lottos, int[] winNums) {
        int collectCount = 0;
        int zeroCount = 0;
        for (int lotto : lottos) {
            if (lotto == 0) zeroCount ++;

            for (int winNum : winNums) {
                if (lotto == winNum) {
                    collectCount ++;
                    break;
                }
            }
        }
        
        if (collectCount + zeroCount == 0) {
            return new int[]{6, 6};
        }
        
        return new int[]{7 - collectCount - zeroCount, collectCount == 0 ? 6 : 7 - collectCount };
    }
}