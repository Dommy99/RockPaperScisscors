import java.util.ArrayList;

/**
 * A class that holds an arraylist this array stores the wins into the gameHistory
 */
class GameHistory {
    private ArrayList<String> gameHistory;

    public GameHistory() {
        gameHistory = new ArrayList<>();
    }

    public void addMatchResult(String winner, int wins) {
        gameHistory.add(winner + " wins: " + wins);
    }

    public String getGameHistory() {
        StringBuilder history = new StringBuilder();
        for (String result : gameHistory) {
            history.append(result).append("\n");
        }
        return history.toString();
    }
}

