class Solution {
    public String solution(String s, String skip, int index) {
        String answer = "";
    
        for (char alphabet : s.toCharArray()) {
            answer += changeAlphabet(alphabet, skip, index);
        }
        
        return answer;
    }
    
    private char changeAlphabet(char alphabet, String skip, int index) {
        int count = 0;
        while (count < index) {
            alphabet ++;
            if (alphabet > 'z') alphabet = 'a';
            if (!containsAlphabet(alphabet, skip)) count ++;
        }
        
        return alphabet;
    }
    
    private boolean containsAlphabet(char alphabet, String str) {
        return str.contains(String.valueOf(alphabet));
    }
    
}