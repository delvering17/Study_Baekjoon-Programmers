import java.util.Arrays;
import java.util.Collections;
import java.util.stream.Stream;

class Solution {
    public long solution(long n) {
        StringBuilder answer = new StringBuilder();
        int [] arr = Stream.of(String.valueOf(n).split("")).mapToInt(Integer::parseInt).toArray();
        Integer[] arr2 = Arrays.stream(arr).boxed().toArray(Integer[]::new);
        Arrays.sort(arr2, Collections.reverseOrder());
        for(Integer num : arr2) {
            answer.append(num);
        }
        return Long.parseLong(answer.toString());
    }
}