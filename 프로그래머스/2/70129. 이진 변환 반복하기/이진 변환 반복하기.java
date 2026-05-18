class Solution {
    public int[] solution(String s) {
        int changeBinaryCount = 0;
        int removeZeroCount = 0;

        while(!s.equals("1")) {
            changeBinaryCount ++;

            String removeZeroString = s.replace("0", "");
            removeZeroCount += s.length() - removeZeroString.length();
            s = Integer.toBinaryString(removeZeroString.length());
        }
        return new int[]{changeBinaryCount, removeZeroCount};
    }
}