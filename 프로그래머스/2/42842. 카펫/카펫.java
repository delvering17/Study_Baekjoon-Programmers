class Solution {
    public int[] solution(int brown, int yellow) {
        int extent = brown + yellow;
        
        for (int w = 3; w <= 1000000; w++) {
            for (int h = 3; h <= w; h++) {
                if (extent == w * h && yellow == (w - 2) * (h - 2)) {
                    return new int[]{w, h};
                }
            }
        }
        
        return new int[]{};
    }
}