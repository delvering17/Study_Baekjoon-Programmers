class Solution {
    public long solution(int n, int[] times) {
        return binarySearch(n, times);
    }
    
    private long binarySearch(int n, int[] times) {
        long start = 0;
        long end = 1_000_000_000_000_000_000L;
        
        while (start < end) {
            long mid = (start + end) / 2;
            if (isValid(mid, n, times)) {
                end = mid;
            } else {
                start = mid + 1;
            }
            
        }
        
        return start;
    }
    
    private boolean isValid(long t, int waitCount, int[] times) {
        long availabeCount = 0;
        for (int time : times) {
            availabeCount += t / time;
        }
        
        return availabeCount >= waitCount;
    }
}