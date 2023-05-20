class Solution {
    public String solution(int[] food) {
        String answer = "";
        StringBuilder save = new StringBuilder();
        for (int i = 1; i < food.length; i++) {
            save.append(String.valueOf(i).repeat(food[i]/2));
        }
        answer = save + "0";
        answer += save.reverse();
        return answer;
    }
}