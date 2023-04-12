import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    playGame();
    }

    public static String playGame(){
/**
 * player has name player1/2
 * player is prompted to type play to play, Type 'history' to view your game history or Type 'quit' to stop playing.
 *
 */
        Scanner userInput = new Scanner(System.in);
        System.out.println("Enter Play(p), History(h), or Quit(q)");
        String answer = userInput.nextLine();
        System.out.println(answer);
        if(answer.equalsIgnoreCase("p")){
            System.out.println("play game");
        }else if (answer.equalsIgnoreCase("h")){
            System.out.println("history");
        }else if (answer.equalsIgnoreCase("q")){
            System.out.println("quit");
        }else {

        }
    userInput.close();
    return "";
    }

}
