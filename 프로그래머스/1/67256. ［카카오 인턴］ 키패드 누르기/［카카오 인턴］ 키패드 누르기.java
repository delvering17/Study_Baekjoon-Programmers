import java.util.*;

class Solution {
    
    private Map<String, Point> keypad;
    private String handPreference;
    
    public String solution(int[] numbers, String hand) {
        keypad = buildKeypad();
        handPreference = hand.equals("left") ? "L" : "R";
        
        StringBuilder sb = new StringBuilder();
        String currentLeftHand = "*";
        String currentRightHand = "#";
        
        for (int targetKey : numbers) {
            String pushHand = decideHand(currentLeftHand, currentRightHand, String.valueOf(targetKey));
            
            sb.append(pushHand);
            if (pushHand.equals("L")) {
                currentLeftHand = String.valueOf(targetKey);
            } else if (pushHand.equals("R")) {
                currentRightHand = String.valueOf(targetKey);
            }
        }
        
        return sb.toString();
    }
    private String decideHand(String leftHand, String rightHand, String target) {
        Point keyPoint = keypad.get(target);
        if (keyPoint.column == 1) {
            return "L";
        }
        if (keyPoint.column == 3) {
            return "R";
        }
        
        int leftHandDistance = calculateDistance(leftHand, target);
        int rightHandDistance = calculateDistance(rightHand, target);
        
        int result = leftHandDistance - rightHandDistance;
        if (result > 0) {
            return "R";
        } else if (result < 0) {
            return "L";
        }
        
        return handPreference;
    }
    
    private int calculateDistance(String currentKey, String targetKey) {
        Point currentPoint = keypad.get(currentKey);
        Point targetPoint = keypad.get(targetKey);
        
        int rowDistance = Math.abs(currentPoint.row - targetPoint.row);
        int columnDistance = Math.abs(currentPoint.column - targetPoint.column);
        
        return rowDistance + columnDistance;
    }
    
    private Map<String, Point> buildKeypad() {
        Map<String, Point> keypad = new HashMap<>();
        keypad.put("1", new Point(1, 1));
        keypad.put("2", new Point(1, 2));
        keypad.put("3", new Point(1, 3));
        keypad.put("4", new Point(2, 1));
        keypad.put("5", new Point(2, 2));
        keypad.put("6", new Point(2, 3));
        keypad.put("7", new Point(3, 1));
        keypad.put("8", new Point(3, 2));
        keypad.put("9", new Point(3, 3));
        keypad.put("*", new Point(4, 1));
        keypad.put("0", new Point(4, 2));
        keypad.put("#", new Point(4, 3));
        
        return keypad;
    }
    
    private boolean isCenterColumnKey(int number) {
        return number == 2 || number == 5 || number == 8 || number == 0; 
    }
    
    private static class Point {
        public final int row;
        public final int column;
        
        public Point(int row, int column) {
            this.row = row;
            this.column = column;
        }
    }
}