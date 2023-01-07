import java.util.Scanner;

class Main {
    public String solution(int n, String[] arr) {
        String answer = "";
        for (String str : arr) {
            int max = 0;
            String res = "?";
            int[] alpha = new int[26];

            char[] chars = str.toCharArray();
            for (char c : chars) {
                if (c >= 97 && c <= 122) alpha[c - 97]++;
            }
            for (int i = 0; i < 26; i ++) {
                if (max < alpha[i]) {
                    max = alpha[i];
                    res = String.valueOf((char)(i+97));
                } else if (max == alpha[i]) {
                    res = "?";
                }
            }
            System.out.println(res);
        }
        return answer;
    }
    public static void main(String[ ] args) {
        Main T = new Main();
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        String[] arr = new String[n];
        for (int i = 0; i < n; i++) arr[i] = sc.nextLine();
        System.out.print(T.solution(n, arr));
    }
}
