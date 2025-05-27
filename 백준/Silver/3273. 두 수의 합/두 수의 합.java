import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        int[] arr = new int[n];
        StringTokenizer st = new StringTokenizer(br.readLine());

        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        int target = Integer.parseInt(br.readLine());
        
        Arrays.sort(arr);
        
        int left = 0;
        int right = arr.length - 1;
        int count = 0;
        
        while (left < right) {
            int sum = arr[left] + arr[right];
            
            if (sum == target) {
                count++;
                left++;
            } else if (sum < target) {
                left++;
            } else if (sum > target) {
                right--;
            }
            
        }
        
        System.out.println(count);
    }
}
