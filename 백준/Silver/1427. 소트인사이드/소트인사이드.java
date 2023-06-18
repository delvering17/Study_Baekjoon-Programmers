import java.util.*;

class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        String[] split = str.split("");
        Arrays.sort(split, Comparator.reverseOrder());
        StringBuilder sb = new StringBuilder();
        for (String num : split) {
            sb.append(num);
        }
        System.out.print(sb);
    }
}