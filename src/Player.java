public abstract class  Player {
    private String name;
    private int wins;
    public String getName() {
        return name;
    }

    public int getWins(){
        return wins;
    }
    public void setWins(){
        this.wins += 1;
    }

}
