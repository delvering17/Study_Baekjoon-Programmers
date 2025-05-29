import java.util.*;

class Solution {
    
    private static final int MAX_VALUE = 10_000;
    private int[] num;
    private int[][] links;
    private int[] parents;
    private int root;
    private int limit;
    private int count;
    
    public int solution(int k, int[] num, int[][] links) {

        this.num = num;
        this.links = links;
        this.parents = extractParents(links);
        this.root = findRootIndex(parents);
        
        int sum = 0;
        for (int i = 0; i < num.length; i++) {
            sum += num[i];
        }
        int low = sum / k;
        int high = sum;
        
        while (low <= high) {
            int mid = (low + high) / 2;
            if (check(mid, k)) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
            
        }
        
        return low;
    }
    
    private boolean check(int limit, int k) {
        count = 0;
        this.limit = limit;
        dfs(root);
        if (count < k) return true;
        
        return false;
    }
    
    private int dfs(int node) {
        if (node == -1) {
            return 0;
        }
        if (num[node] > limit) {
            count = MAX_VALUE + 1;
            return num[node];
        }
        
        int numLeft = dfs(links[node][0]);
        int numRight = dfs(links[node][1]);

        if (numLeft + numRight + num[node] <= limit) {
            return numLeft + numRight + num[node];
        }
        if (numLeft == 0 || numRight == 0) {
            count ++;
            return num[node];
        }
        
        if (numLeft + num[node] <= limit && numRight + num[node] <= limit) {
            count ++;
            return num[node] + Math.min(numLeft, numRight);
        }
        
        if (numLeft + num[node] <= limit) {
            count ++;
            return numLeft + num[node];
        }
        
        if (numRight + num[node] <= limit) {
            count ++;
            return numRight + num[node];
        }
     
        count += 2;
        return num[node];
    }
    
    private int[] extractParents(int[][] links) {
        int[] parents = new int[MAX_VALUE];
        
        Arrays.fill(parents, -1);
        for (int i = 0; i < links.length; i++) {
            int left = links[i][0];
            int right = links[i][1];
            
            if (left != -1) {
                parents[left] = i;
            }
            if (right != -1) {
                parents[right] = i;
            }
        }
        
        return parents;
    }
    
    private int findRootIndex(int[] parents) {
        for (int i = 0; i < parents.length; i++) {
            if (parents[i] == -1) {
                return i;
            }  
        }
        
        return -1;
    }
}