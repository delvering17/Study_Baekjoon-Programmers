class Solution {
    int answer = 0;
    
    public int solution(int[] numbers, int target) {
        func(numbers, 0, target, 0);
        
        return answer;
    }
    
    public void func(int[] numbers, int index, int target, int sum) {
        if (index == numbers.length) {
            if (target == sum) {
                answer ++;
            }
            return;
        }
        
        func(numbers, index + 1, target, sum + numbers[index]);
        func(numbers, index + 1, target, sum - numbers[index]);
    }
    
}