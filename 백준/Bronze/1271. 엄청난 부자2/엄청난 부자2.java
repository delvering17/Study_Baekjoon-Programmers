import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();
        BigInteger sum = new BigInteger(st.nextToken());
        BigInteger people = new BigInteger(st.nextToken());
        BigInteger[] res = sum.divideAndRemainder(people);
        sb.append(res[0]).append('\n').append(res[1]);
        System.out.println(sb);
    }
}