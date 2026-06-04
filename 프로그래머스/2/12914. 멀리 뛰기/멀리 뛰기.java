class Solution {
    int[] temp;

    public long solution(int n) {
        temp = new int[n + 1];
        return getJump(n);
    }

    private int getJump(int n) {
        if (n == 1) return 1;
        if (n == 2) return 2;

        if (temp[n] != 0) return temp[n];

        temp[n] = (getJump(n - 1) + getJump(n - 2)) % 1234567;
        return temp[n];
    }
    
}