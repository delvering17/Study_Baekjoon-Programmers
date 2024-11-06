class Solution {
    
    public String solution(String rsp) {
        String[] split = rsp.split("");

        StringBuilder sb = new StringBuilder();
        for (String str : split) {
            sb.append(convert(str));
        }

        return sb.toString();
    }

    private String convert(String str) {
        if (str.equals("0")) return "5";
        if (str.equals("5")) return "2";
        return "0";
    }
}