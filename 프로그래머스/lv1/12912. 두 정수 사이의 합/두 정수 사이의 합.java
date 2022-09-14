class Solution {
    public long solution(int a, int b) {
        long sum = 0;
        if(a == b) {
            return a;
        } else if (b > a) {
            while(a < b + 1) {
                sum += a;
                a++;
            }
        } else {
            while(b < a + 1) {
                sum += b;
                b++;
            }
        }
        return sum;
    }
}