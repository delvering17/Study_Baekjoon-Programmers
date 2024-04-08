class Solution {
    public int solution(int[][] sizes) {
        int answer = 0;
        int width = Integer.MIN_VALUE;
        int height = Integer.MIN_VALUE;

        for (int[] size : sizes) {
            if (size[0] > size[1]) {
                width = Math.max(width, size[0]);
                height = Math.max(height, size[1]);
            } else {
                width = Math.max(width, size[1]);
                height = Math.max(height, size[0]);
            }
        }

        return width * height;
    }
}