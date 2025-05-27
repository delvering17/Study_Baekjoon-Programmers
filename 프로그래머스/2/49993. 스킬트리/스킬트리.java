import java.util.*;

class Solution {
    public int solution(String skill, String[] skill_trees) {
        // 포함 아니면 skip
        // 포함 이면 순서 확인
        int count = 0;
        for (String trySkillTreeStr : skill_trees) {
            boolean result = validateSkillTree(skill, trySkillTreeStr);
            
            if (result) count++;
        } 
        
        return count;
    }
    
    private boolean validateSkillTree(String skill, String trySkillTreeStr) {
        Queue<Character> q = getSkillTree(skill);
        char[] trySkills = trySkillTreeStr.toCharArray();
        for (char trySkill : trySkills) {
            if (!q.contains(trySkill)) {
                continue;
            }

            if (q.isEmpty() || q.peek() != trySkill) {
                return false; 
            }
            
            q.poll();
        }
        
        return true;
    }
    
    private Queue<Character> getSkillTree(String skill) {
        Queue<Character> skillTree = new LinkedList<>();
        char[] skills = skill.toCharArray();
        for (char c : skills) {
            skillTree.add(c);
        }
        return skillTree;
    }
}