import java.util.Scanner;
public class Main {

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        int cnt = 0;

        int[] arr1 = new int[26];
        int[] arr2 = new int[26];

        for(int i = 0 ; i < 52 ; i++) {
            int num = str.charAt(i)-'A';
            if(arr1[num] == 0) {
                arr1[num] = i + 1;
            } else {
                arr2[num] = i + 1;
            }
        }

        for(int i = 0 ; i < 26 ; i++) {
            for(int j = 0 ; j < 26 ; j++) {
                if(arr1[i] < arr1[j] && arr1[j] < arr2[i] && arr2[i] < arr2[j]) {
                    cnt++;
                }
            }
        }
        System.out.println(cnt);
    }
}