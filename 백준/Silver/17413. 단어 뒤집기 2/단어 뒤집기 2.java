import java.util.*;

class Main {

    public String solution(String str) {
        StringBuilder answer = new StringBuilder();
        Stack<Character> s = new Stack<>();
        boolean isNotReverse = false;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == '<') {
                isNotReverse = true;
                while (!s.isEmpty()) {
                    answer.append(s.pop());
                }
                answer.append("<");
            } else if (str.charAt(i) == '>') {
                isNotReverse = false;
                answer.append(">");
            } else if (isNotReverse){
                answer.append(str.charAt(i));
            } else {
                if (str.charAt(i) == ' ') {
                    while (!s.isEmpty()) {
                        answer.append(s.pop());
                    }
                    answer.append(" ");
                } else {
                    s.push(str.charAt(i));
                }
            }
        }
        while (!s.isEmpty()) {
            answer.append(s.pop());
        }
        return answer.toString();
    }
    public static void main(String[ ] args) {
        Main T = new Main();
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println(T.solution(str));

    }
}