import java.util.Arrays;

class Solution {
    public int solution(int[] num_list) {
        double pow = Math.pow(Arrays.stream(num_list).sum(), 2);
        int multiply = Arrays.stream(num_list).reduce(1, (a, b) -> a * b);
        return pow > multiply ? 1 : 0;
    }
}