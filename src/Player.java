public class Player {
    private String name;
    private int wins;

    public Player(String name, int wins){
        this.name = name;
        this.wins= wins;

    }

//    getters
    public String getName(){
        return name;
    }
    public int getWins(){
        return wins;
    }
//    setters
    public void setName(String name){
        this.name = name;
    }
    public void setWins(int wins){
        this.wins = wins;
    }

}
