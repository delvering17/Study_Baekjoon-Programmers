class Solution {
    public int[] solution(int money) {
        int coffeePrice = 5500;
        
        return new int[]{ money / coffeePrice, money % coffeePrice};
    }
}