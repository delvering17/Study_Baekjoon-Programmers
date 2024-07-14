class Solution {
    public int solution(int n) {
        int cutCount = 7;
        int pizza = n / cutCount;
        if (n % cutCount != 0) {
            pizza += 1;
        }

        return pizza;
    }
}