import java.util.Scanner;
import java.util.Stack;

class Main {
    public static void main(String[ ] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < T; i++) {
            String str = sc.next();
            Stack<String> s = new Stack<>();
            boolean res = true;
            String[] arr = str.split("");
            for (int j = 0; j < arr.length; j++) {
                String r = arr[j];
                if (r.equals("(")) s.push(r);
                else {
                    if (s.empty()) {
                        res = false;
                        break;
                    } else s.pop();
                }
            }
            if (!s.empty()) res = false;
            if (res) sb.append("YES\n");
            else sb.append("NO\n");
        }
        System.out.print(sb.toString());
    }
}