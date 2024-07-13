import java.util.Arrays;
import java.util.stream.IntStream;

class Solution {
    public int[] solution(int n) {
        return IntStream.rangeClosed(1, n)
                        .filter(it -> it % 2 != 0)
                        .toArray();
    }
}