import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int num1 = Integer.parseInt(st.nextToken());
        int num2 = Integer.parseInt(st.nextToken());

        int a = 100 - num1;
        int b = 100 - num2;
        int c = 100 - (a + b);
        int d = (a * b);
        int q = d / 100;
        int r = d % 100;
        int res1 = c;
        int res2 = d;
        if(q > 0) {
            res1 = c + q;
            res2 = r;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(a).append(" ");
        sb.append(b).append(" ");
        sb.append(c).append(" ");
        sb.append(d).append(" ");
        sb.append(q).append(" ");
        sb.append(r).append("\n");
        sb.append(res1).append(" ");
        sb.append(res2);
        System.out.println(sb.toString());
    }
}