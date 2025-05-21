class Solution {

   public static int solution(String dartResult) {
        char[] charArray = dartResult.toCharArray();

        int[] points = new int[3];
        int currentTry = -1;
        int currentPoint = 0;
        for (char c : charArray) {
            if (Character.isDigit(c)) {
                if (c == '0' && currentPoint == 1) {
                    currentPoint = 10;
                } else {
                    currentPoint = Character.getNumericValue(c);
                    currentTry++;
                    continue;
                }
            }

            if (c == 'S') {
                currentPoint = (int) Math.pow(currentPoint, 1);
            }
            if (c == 'D') {
                currentPoint = (int) Math.pow(currentPoint, 2);
            }
            if (c == 'T') {
                currentPoint = (int) Math.pow(currentPoint, 3);
            }
            if (c == '*') {
                if (currentTry == 0) {
                    currentPoint *= 2;
                    points[currentTry] = currentPoint;
                    continue;
                }

                currentPoint *= 2;
                points[currentTry-1] *= 2;
            }
            if (c == '#') {
                currentPoint *= -1;
            }
            points[currentTry] = currentPoint;
        }

        int result = 0;
        for (int i = 0; i < 3; i++) {
            result += points[i];
        }
        return result;
    }

}