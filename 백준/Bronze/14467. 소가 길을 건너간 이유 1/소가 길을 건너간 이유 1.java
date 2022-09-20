import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int see = Integer.parseInt(sc.nextLine());
        int res = 0;
        Map<String, Integer> map = new HashMap<>();

        for(int i = 0 ; i < see ; i++) {
            String str = sc.nextLine();
            String cow = str.split(" ")[0];
            int cnt = Integer.parseInt(str.split(" ")[1]);
            if(!map.containsKey(cow)) {
                map.put(cow, cnt);
            } else {
                if(map.get(cow) != cnt) {
                    res ++;
                    map.put(cow, cnt);
                }
            }
        }
        System.out.println(res);
    }
}
