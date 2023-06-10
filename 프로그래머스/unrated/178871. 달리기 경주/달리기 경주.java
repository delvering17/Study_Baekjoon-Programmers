import java.util.*;
class Solution {
    public String[] solution(String[] players, String[] callings) {
        HashMap<String, Integer> map = new HashMap<>();
        for (int i = 0; i < players.length; i++) {
            map.put(players[i], i);
        }

        for (String calledPlayer : callings) {
            Integer index = map.get(calledPlayer);
            String frontPlayer = players[index - 1];
            players[index] = frontPlayer;
            players[index-1] = calledPlayer;
            map.put(frontPlayer, index);
            map.put(calledPlayer, index-1);
        }

        return players;
    }
}