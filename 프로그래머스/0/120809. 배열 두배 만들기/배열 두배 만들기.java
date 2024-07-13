import java.util.Arrays;

class Solution {
    public int[] solution(int[] numbers) {
          return Arrays.stream(numbers)
                .map(it -> it * 2)
                .toArray();
    }
}