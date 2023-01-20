import java.util.*;
class Solution {
        public ArrayList<Integer> solution(String s) {
        s = s.substring(1, s.length()-1);
        ArrayList<String> arr = new ArrayList<>();
        while (!s.isEmpty()) {
            if (s.charAt(0) == ',') s = s.substring(1);
            String sub = s.substring(0, s.indexOf("}") + 1);
            sub = sub.substring(1, sub.indexOf("}"));
            s = s.substring(s.indexOf("}") + 1);
            arr.add(sub);
        }

        Comparator<String> c = new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return Integer.compare(o1.length(), o2.length());
            }
        };
        arr.sort(c);

        ArrayList<Integer> answer = new ArrayList<>();
        for (int i = 0; i < arr.size(); i++) {
            String[] split = arr.get(i).split(",");
            for (String r : split) {
                int num = Integer.parseInt(r);
                if (!answer.contains(num)) {
                    answer.add(num);
                    break;
                }
            }

        }
        return answer;
    }
}