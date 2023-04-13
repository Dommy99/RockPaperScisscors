import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        HumanPlayer player1 = new HumanPlayer();
        HumanPlayer player2 = new HumanPlayer();
        Computer cpu = new Computer();
    playGame(player1, player2);
    }

    public static void playGame(Player player1, Player player2){
/**
 * player has name player1/2
 * player is prompted to type play to play, Type 'history' to view your game history or Type 'quit' to stop playing.
 *
 */
        Scanner userInput = new Scanner(System.in);
        System.out.println("Enter PvP(p), PvC(c) History(h), or Quit(q)");
        String answer = userInput.nextLine();
        System.out.println(answer);
        if(answer.equalsIgnoreCase("p")){
            pvpGame(player1,player2);

        }else if (answer.equalsIgnoreCase("h")){

            history();
        }else if (answer.equalsIgnoreCase("q")){

            quit();
        }else if (answer.equalsIgnoreCase("c")){
            startGame( player1, player2);
        }else {
            return;
        }
    userInput.close();

    }

    public static void startGame(Player player1, Player player2){
        int player1wins= 0;
        int player2wins= 0;

        Scanner player1Pick = new Scanner(System.in);
        System.out.println("Player1 Pick Rock(r), Paper(p), or Scissors(s)");
        String p1Answer = player1Pick.nextLine();
        String[] computerMovesArr = {"r","s","p"};
        int randomIndex = new Random().nextInt(computerMovesArr.length);
        String p2Answer = computerMovesArr[randomIndex];
//        String p2Answer = player2Pick.nextLine();

        String [] correctInput = new String[] {"r","s","p"};
        if(Arrays.asList(correctInput).contains(p1Answer) && Arrays.asList(correctInput).contains(p2Answer)) {
            if (p1Answer.equalsIgnoreCase("r") && p2Answer.equalsIgnoreCase("s")) {
                player1wins++;
                System.out.println("Player1 wins: " + player1wins);
                startGame(player1, player2);
            } else if (p1Answer.equalsIgnoreCase("r") && p2Answer.equalsIgnoreCase("p")) {
                player2wins++;
                System.out.println("Player2 wins: " + player2wins);
                startGame(player1, player2);

            } else if (p1Answer.equalsIgnoreCase("p") && p2Answer.equalsIgnoreCase("s")) {
                player2wins++;
                System.out.println("Player2 wins: " + player2wins);
                startGame(player1, player2);
            } else if (p1Answer.equalsIgnoreCase("p") && p2Answer.equalsIgnoreCase("r")) {
                player1wins++;
                System.out.println("Player1 wins: " + player1wins);
                startGame(player1, player2);
            } else if (p1Answer.equalsIgnoreCase("s") && p2Answer.equalsIgnoreCase("r")) {
                player2wins++;
                System.out.println("Player2 wins: " + player2wins);
                startGame(player1, player2);
            } else if (p1Answer.equalsIgnoreCase("s") && p2Answer.equalsIgnoreCase("p")) {
                player1wins++;
                System.out.println("Player1 wins: " + player1wins);
                startGame(player1, player2);
            } else {
                System.out.println("Draw");
                startGame(player1, player2);
            }
        }else {
            System.out.println("Incorrect Input");
            startGame(player1, player2);
        }

        /**
         * prompt player 1 to pick then player 2
         * check combo to see who wins
         * win++ and loss++
         *
         */


    }
    public static void pvpGame(Player player1, Player player2){
        int player1wins= 0;
        int player2wins= 0;

        Scanner player1Pick = new Scanner(System.in);
        Scanner player2Pick = new Scanner(System.in);
        System.out.println("Player1 Pick Rock(r), Paper(p), or Scissors(s)");
        String p1Answer = player1Pick.nextLine();
        String p2Answer = player2Pick.nextLine();

            if (p1Answer.equalsIgnoreCase("r") && p2Answer.equalsIgnoreCase("s")) {
                player1wins++;
                System.out.println("Player1 wins: " + player1wins);
                startGame(player1, player2);
            } else if (p1Answer.equalsIgnoreCase("r") && p2Answer.equalsIgnoreCase("p")) {
                player2wins++;
                System.out.println("Player2 wins: " + player2wins);
                startGame(player1, player2);

            } else if (p1Answer.equalsIgnoreCase("p") && p2Answer.equalsIgnoreCase("s")) {
                player2wins++;
                System.out.println("Player2 wins: " + player2wins);
                startGame(player1, player2);
            } else if (p1Answer.equalsIgnoreCase("p") && p2Answer.equalsIgnoreCase("r")) {
                player1wins++;
                System.out.println("Player1 wins: " + player1wins);
                startGame(player1, player2);
            } else if (p1Answer.equalsIgnoreCase("s") && p2Answer.equalsIgnoreCase("r")) {
                player2wins++;
                System.out.println("Player2 wins: " + player2wins);
                startGame(player1, player2);
            } else if (p1Answer.equalsIgnoreCase("s") && p2Answer.equalsIgnoreCase("p")) {
                player1wins++;
                System.out.println("Player1 wins: " + player1wins);
                startGame(player1, player2);
            } else {
                System.out.println("Draw");
                startGame(player1, player2);
            }
    }
    public static void history(){
        System.out.println("history");
    }
    public static void quit(){
        System.out.println("quit");

    }


}
