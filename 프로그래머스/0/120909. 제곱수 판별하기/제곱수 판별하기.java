class Solution {
    public int solution(int n) {
        int number = (int) Math.sqrt((double) n);
        return number * number == n ? 1 : 2;
    }
}