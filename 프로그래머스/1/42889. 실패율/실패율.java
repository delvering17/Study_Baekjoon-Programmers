import java.util.*;

class Solution {
    public int[] solution(int N, int[] stages) {
        int[] failResult = new int[N+2];
        int[] totalCount = new int[N+1];

        for (int stage : stages) {
            failResult[stage]++;
        }

        totalCount[N] = failResult[N] + failResult[N+1];
        for (int i = N - 1; i >= 1; i --) {
            totalCount[i] = failResult[i] + totalCount[i+1];
        }

        Map<Integer, Double> stageMap = new HashMap<>();
        for (int i = 1; i < N+1; i++) {
            if (failResult[i] == 0 || totalCount[i] == 0) {
                stageMap.put(i, 0.0);
            } else {
                stageMap.put(i, (double) failResult[i] / totalCount[i]);
            }
        }

        List<Integer> answer = new ArrayList<>(stageMap.keySet());
        return answer.stream()
                .sorted(Comparator.comparingDouble(stageMap::get).reversed())
                .mapToInt(Integer::intValue)
                .toArray();
    }
}
