class Solution {
    public int solution(int[] nums) {
    
        return bfs(nums, 0, 0, 0);
    }
    
    public int bfs(int[] arr, int depth, int start, int sum) {
        if (depth == 3) {
            return isPrime(sum) ? 1 : 0;
        }
        
        int answer = 0;
        for (int i = start; i < arr.length; i++) {
            answer += bfs(arr, depth + 1, i + 1, sum + arr[i]);
        }
        
        return answer;
    }
    
    private boolean isPrime(int num) {
        if (num <= 1) return false;
        if (num <= 3) return true;
        if (num % 2 == 0 || num % 3 == 0) return false;
        for (int i = 5; i * i <= num; i += 6) {
            if (num % i == 0 || num % (i + 2) == 0) return false;
        }
        
        return true;
    }
}