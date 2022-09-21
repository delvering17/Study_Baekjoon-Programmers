class Solution {
    public String solution(String s) {
        String[] arr = s.split(" ");

        int max = Integer.parseInt(arr[0]);
        int min = Integer.parseInt(arr[0]);
        for (String str : arr) {
            int num = Integer.parseInt(str);
            if(num > max) {
                max = num;
            } else if (num < min) {
                min = num;
            }
        }
        return min + " " + max;
    }
}