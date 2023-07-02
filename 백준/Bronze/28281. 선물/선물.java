import java.util.Scanner;

class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int index = -1;
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < n - 1; i++) {
            int num = arr[i] + arr[i+1];
            if (min > num) {
                min = num;
                index = i;
            }
        }
        int result = (arr[index] + arr[index+1]) * m;
        System.out.println(result);
    }
}