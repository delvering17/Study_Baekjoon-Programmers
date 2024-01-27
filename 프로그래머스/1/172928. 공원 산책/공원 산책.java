class Solution {

    public int startX = 0;
    public int startY = 0;
    
    public int boardSizeX = 0;
    public int boardSizeY = 0;
    public String[][] parkBoard;

    public int[] solution(String[] park, String[] routes) {
        parkBoard = setUpPark(park);

        for (String route : routes) {
            go(route);
        }

        return new int[]{startX, startY};
    }

    public String[][] setUpPark(String[] park) {
        boardSizeX = park.length;
        boardSizeY = park[0].length();
        String[][] parkBoard = new String[boardSizeX][boardSizeY];
        for (int i = 0; i < boardSizeX; i++) {
            String[] arr = park[i].split("");
            for (int j = 0; j < boardSizeY; j++) {
                parkBoard[i][j] = arr[j];
                if (arr[j].equals("S")) {
                    startX = i;
                    startY = j;
                }
            }
        }

        return parkBoard;
    }
    
    public void go(String route) {
        String direction =  route.split(" ")[0];
        int moveAmount = Integer.parseInt(route.split(" ")[1]);

        int movedX = startX;
        int movedY = startY;

        boolean isMoved = true;
        while (moveAmount-- > 0) {

            switch (direction) {
                case "N":
                    movedX--;
                    break;
                case "S":
                    movedX++;
                    break;
                case "W":
                    movedY--;
                    break;
                case "E":
                    movedY++;
                    break;
            }

            if (!isPossibleMove(movedX, movedY)) {
                isMoved = false;
                break;
            }

        }

        if (isMoved) {
            move(movedX, movedY);
        }
    }

    private boolean isPossibleMove(int movedX, int movedY) {

        boolean isOutBoard = movedX+1 > boardSizeX || movedX < 0 || movedY+1 > boardSizeY || movedY < 0;
        if (isOutBoard) {
            return false;
        }

        boolean isObstacle = parkBoard[movedX][movedY].equals("X");
        if (isObstacle) {
            return false;
        }

        return true;
    }

    public void move(int x, int y) {
        startX = x;
        startY = y;
    }
    
}