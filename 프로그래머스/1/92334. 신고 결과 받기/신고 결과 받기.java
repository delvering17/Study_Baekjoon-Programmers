import java.util.*;

class Solution {
    public int[] solution(String[] id_list, String[] report, int k) {
        Map<String, Set<String>> reportMap = new HashMap<>();
        
        for (int i = 0; i < report.length; i ++) {
            String[] split = report[i].split(" ");
            String reporterId = split[0];
            String reportedId = split[1];
            
            reportMap.computeIfAbsent(reportedId, key -> new HashSet<>()).add(reporterId);
        }
        
        Map<String, Integer> reporterMailCountMap = new HashMap<>();
        for (Set<String> set : reportMap.values()) {
            if (set.size() < k) {
                continue;
            }
            
            for (String reporter : set) {
                reporterMailCountMap.merge(reporter, 1, Integer::sum);
            }
        }
        
        int[] answer = new int[id_list.length];
        for (int i = 0; i < id_list.length; i++) {
            answer[i] = reporterMailCountMap.getOrDefault(id_list[i], 0);
        }

        return answer;
    }
    
}