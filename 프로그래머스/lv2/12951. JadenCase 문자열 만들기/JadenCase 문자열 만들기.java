class Solution {
    public String solution(String s) {
        String[] arr = s.toLowerCase().split(" ");
        for (String s1 : arr) {
            System.out.println("s1 = " + s1);
        }
        StringBuilder res = new StringBuilder();
        for (int i = 0 ; i < arr.length ; i++) {
            String str = arr[i];
            if(!str.equals("")) {
                res.append(str.substring(0, 1).toUpperCase()).append(str.substring(1));
            }
            if(i != arr.length-1) {
                res.append(" ");
            }
        }
        if(s.charAt(s.length()-1) == ' ') {
            res.append(" ");
        }
        return res.toString();
    }
}