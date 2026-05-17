class Solution {
    public int solution(int[] bandage, int health, int[][] attacks) {
        int answer = 0;
        int continuousTime = bandage[0];
        int castingTime = bandage[1];
        int additionalRecovery = bandage[2];
        
        int countTime = 0;
        int currentHealth = health;
        for (int i = 0; i < attacks.length; i ++) {
            int attackTime = attacks[i][0];
            int damage = attacks[i][1];
            
            int time = attackTime - countTime - 1;
            int recovery = time * castingTime + (time / continuousTime) * additionalRecovery; 
            currentHealth += recovery;
            
            if (health < currentHealth) {
                currentHealth = health;
            }
            
            currentHealth -= damage;
            if (currentHealth <= 0) {
                return -1;
            }
            
            countTime = attackTime;
        }
        return currentHealth;
    }
}