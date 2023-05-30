import java.util.*;

class Solution {
        public ArrayList<Integer> solution(int[] answers) {
        int[] answer = new int[3];
        int max = -1;

        int a = 2;
        int[] b = {2, 1, 2, 3, 2, 4, 2, 5};
        int[] c = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};

        if (answers[0] < 4) answer[answers[0]-1]++;
        for (int i = 1; i < answers.length; i++) {
            if (a == answers[i]) answer[0]++;
            if (b[i % 8] == answers[i]) answer[1]++;
            if (c[i % 10] == answers[i]) answer[2]++;
            if (++a == 6) a = 1;
        }

        String index = "";
        for (int i = 0; i < 3; i++) {
            if (max < answer[i]) {
                max = answer[i];
                index = String.valueOf(i+1);
            } else if (max == answer[i]) {
                index += (i+1);
            }
        }
        ArrayList<Integer> result = new ArrayList<>();
        for (String str : index.split("")) result.add(Integer.parseInt(str));
        return result;
    }
}