/**
 * Player class that holds the players wins
 */
public abstract class  Player {
    private int wins;

    public int getWins(){
        return wins;
    }
    public void setWins(){
        this.wins += 1;
    }

}
