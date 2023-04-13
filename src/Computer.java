import java.util.Random;

public class Computer extends Player {
    @Override
    public String getName() {
        return super.getName();
    }

    public String getMove() {
        String[] computerMovesArr = {"r", "s", "p"};
        int randomIndex = new Random().nextInt(computerMovesArr.length);
        return computerMovesArr[randomIndex];
    }
}

