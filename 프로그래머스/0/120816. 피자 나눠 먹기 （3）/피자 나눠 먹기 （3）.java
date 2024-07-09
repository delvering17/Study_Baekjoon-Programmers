class Solution {
    public int solution(int slice, int n) {
        if (n % slice != 0) {
            return (n / slice) + 1; 
        } 
        return n / slice;
    }
}