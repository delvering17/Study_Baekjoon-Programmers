class Solution {
    
    int answer = 0;
    
    public int solution(int[] numbers, int target) {
        dfs(numbers, 0, 0, target);
        return answer;
    }
    
    public void dfs(int[] numbers, int result, int depth, int target) {
        // 결과 확인
        if (depth == numbers.length) {
            if (target == result) {
                answer++;
            }
            return;
        }
            
        // 재귀
        dfs(numbers, result + numbers[depth], depth + 1, target);
        dfs(numbers, result - numbers[depth], depth + 1, target);
    }
    
    
    
}