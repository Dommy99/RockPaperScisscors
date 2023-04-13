import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        HumanPlayer player1 = new HumanPlayer();
        HumanPlayer player2 = new HumanPlayer();
        Computer cpu = new Computer();
        game(player1, player2,cpu);
    }

    public static void game(Player player1, Player player2, Computer computer){
        Scanner userInput = new Scanner(System.in);
        System.out.println("Enter PvP(p), PvC(c) History(h), or Quit(q)");
        String answer = userInput.nextLine();
        System.out.println(answer);
        if(answer.equalsIgnoreCase("p")){
            pvpGame(player1,player2,computer);

        }else if (answer.equalsIgnoreCase("h")){

            history(player1,player2,computer);
        }else if (answer.equalsIgnoreCase("q")){

            userInput.close();
        }else if (answer.equalsIgnoreCase("c")){
            cpuGame(player1, player2,computer);
        }else {
            return;
        }
    userInput.close();

    }
    public static void cpuGame(Player player1, Player player2, Computer computer){

        Scanner player1Pick = new Scanner(System.in);
        System.out.println("Player1 Pick Rock(r), Paper(p), Scissors(s) or History(h)");
        String p1Answer = player1Pick.nextLine();
        String p2Answer = computer.getMove();
        String [] correctInput = new String[] {"r","s","p","h"};

        if(Arrays.asList(correctInput).contains(p1Answer) && Arrays.asList(correctInput).contains(p2Answer)) {
            if (p1Answer.equalsIgnoreCase("r") && p2Answer.equalsIgnoreCase("s")) {
                player1.setWins();
                System.out.println("Player1 wins: " + player1.getWins());
                cpuGame(player1, player2,computer);
            } else if (p1Answer.equalsIgnoreCase("r") && p2Answer.equalsIgnoreCase("p")) {
                computer.setWins();
                System.out.println("Cpu wins: " + computer.getWins());
                cpuGame(player1, player2,computer);

            } else if (p1Answer.equalsIgnoreCase("p") && p2Answer.equalsIgnoreCase("s")) {
                computer.setWins();
                System.out.println("Cpu wins: " + computer.getWins());
                cpuGame(player1, player2,computer);
            } else if (p1Answer.equalsIgnoreCase("p") && p2Answer.equalsIgnoreCase("r")) {
                player1.setWins();
                System.out.println("Player1 wins: " + player1.getWins());
                cpuGame(player1, player2,computer);
            } else if (p1Answer.equalsIgnoreCase("s") && p2Answer.equalsIgnoreCase("r")) {
                computer.setWins();
                System.out.println("Cpu wins: " + computer.getWins());
                cpuGame(player1, player2,computer);
            } else if (p1Answer.equalsIgnoreCase("s") && p2Answer.equalsIgnoreCase("p")) {
                player1.setWins();
                System.out.println("Player1 wins: " + player1.getWins());
                cpuGame(player1, player2,computer);
            } else if (p1Answer.equalsIgnoreCase("h")) {
                history(player1,player2,computer);
            }else {
                System.out.println("Draw");
                cpuGame(player1, player2,computer);
            }
        }else {
            System.out.println("Incorrect Input");
            cpuGame(player1, player2,computer);
        }

    }
    public static void pvpGame(Player player1, Player player2,Computer computer){

        Scanner player1Pick = new Scanner(System.in);
        Scanner player2Pick = new Scanner(System.in);
        System.out.println("Player1 Pick Rock(r), Paper(p), Scissors(s) or History(h)");
        String p1Answer = player1Pick.nextLine();
        String p2Answer = player2Pick.nextLine();

            if (p1Answer.equalsIgnoreCase("r") && p2Answer.equalsIgnoreCase("s")) {
                player1.setWins();
                System.out.println("Player1 wins: " + player1.getWins());
                pvpGame(player1,player2,computer);
            } else if (p1Answer.equalsIgnoreCase("r") && p2Answer.equalsIgnoreCase("p")) {
                player2.setWins();
                System.out.println("Player2 wins: " + player2.getWins());
                pvpGame(player1,player2,computer);

            } else if (p1Answer.equalsIgnoreCase("p") && p2Answer.equalsIgnoreCase("s")) {
                player2.setWins();
                System.out.println("Player2 wins: " + player2.getWins());
                pvpGame(player1,player2,computer);

            } else if (p1Answer.equalsIgnoreCase("p") && p2Answer.equalsIgnoreCase("r")) {
                player1.setWins();
                System.out.println("Player1 wins: " + player1.getWins());
                pvpGame(player1,player2,computer);

            } else if (p1Answer.equalsIgnoreCase("s") && p2Answer.equalsIgnoreCase("r")) {
                player2.setWins();
                System.out.println("Player2 wins: " + player2.getWins());
                pvpGame(player1,player2,computer);

            } else if (p1Answer.equalsIgnoreCase("s") && p2Answer.equalsIgnoreCase("p")) {
                player1.setWins();
                System.out.println("Player1 wins: " + player1.getWins());
                pvpGame(player1,player2,computer);

            } else if (p1Answer.equalsIgnoreCase("h") || (p2Answer.equalsIgnoreCase("h"))) {
                history(player1,player2,computer);
            }else {
                System.out.println("Draw");
                pvpGame(player1,player2,computer);

            }
    }
    public static void history(Player player1, Player player2, Computer computer){
        System.out.println("*** History *** "+ '\n' +
                "Player 1 wins: "+ player1.getWins() + '\n' +
                "Player 2 wins: "+ player2.getWins()+ '\n' +
                "Cpu wins: "+ computer.getWins());
                game(player1, player2,computer);
    }


}
