import java.util.Arrays;
import java.util.List;

class Solution {
    public int[] solution(String[] name, int[] yearning, String[][] photo) {
        int[] answer = new int[photo.length];
        List<String> nameList = Arrays.asList(name);
        for (int i = 0; i < photo.length; i++) {
            int sum = 0;
            for (String str : photo[i]) {
                int index = nameList.indexOf(str);
                if (index != -1) sum += yearning[index];
            }
            answer[i] = sum;
        }
        return answer;
    }
}