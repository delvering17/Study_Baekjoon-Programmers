class Solution {
    boolean solution(String s) {
        String[] strs = s.split("");
        int count = 0;
        for (String str : strs) {
            if (str.equals("(")) count ++;
            if (str.equals(")")) {
                if (count == 0) return false;
                count--;
            }
        }
        
        return count == 0;
    }
}