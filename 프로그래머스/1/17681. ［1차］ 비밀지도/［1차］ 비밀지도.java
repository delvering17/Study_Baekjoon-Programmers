class Solution {
    
    private final static char WALL = '1';
    
    public String[] solution(int n, int[] arr1, int[] arr2) {
        char[][] decryptMap1 = getDecryptMap(arr1);
        char[][] decryptMap2 = getDecryptMap(arr2);
        
        char[][] mergedMap = mergeMap(decryptMap1, decryptMap2);
        
        return convertPrintMap(mergedMap);
    }
    
    private char[][] mergeMap(char[][] map1, char[][] map2) {
        int length = map1.length;
        char[][] mergedMap = new char[length][length];
        
        for (int i = 0; i < length; i++) {
            for (int j = 0; j < length; j++) {
                mergedMap[i][j] = calculateBlock(map1[i][j], map2[i][j]);
            }
        }
        
        return mergedMap;
    }
    
    private char calculateBlock(char c1, char c2) {
        if (isWall(c1) || isWall(c2)) {
            return '1';
        }
        return '0';
    } 
    
    private boolean isWall(char c) {
        return c == WALL;
    }
    
    private char[][] getDecryptMap(int[] encryptArr) {
        int length = encryptArr.length;
        char[][] decryptMap = new char[length][length];
        
        for (int i = 0; i < length; i++) {
            String dencryptStr = decrypt(length, encryptArr[i]);
            decryptMap[i] = dencryptStr.toCharArray();
        }
         
        return decryptMap;
    }
    
    private String decrypt(int digit, int num) {
        return String.format("%"+digit+"s", Integer.toBinaryString(num));
    }
    
    private String[] convertPrintMap(char[][] map) {
        String[] printResult = new String[map.length];
        for (int i = 0; i < map.length; i++) {
            StringBuilder sb = new StringBuilder();
            for (char c : map[i]) {
                sb.append(convertPrintBlock(c));
            }
            
            printResult[i] = sb.toString();
        }
        
        return printResult;
    }
    
    private String convertPrintBlock(char c) {
        return c == '1' ? "#" : " ";
    }
    
}