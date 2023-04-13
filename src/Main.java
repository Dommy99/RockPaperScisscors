import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {
    //    private ArrayList<String> gameHistory = new ArrayList<>();
    public static void main(String[] args) {
        HumanPlayer player1 = new HumanPlayer();
        HumanPlayer player2 = new HumanPlayer();
        Computer cpu = new Computer();
        GameHistory gameHistory = new GameHistory();
        game(player1, player2, cpu, gameHistory);
    }

    public static void game(Player player1, Player player2, Computer computer, GameHistory gameHistory) {
        Scanner userInput = new Scanner(System.in);
        System.out.println("Enter PvP(p), PvC(c) History(h), or Quit(q)");
        String answer = userInput.nextLine();
        System.out.println(answer);
        if (answer.equalsIgnoreCase("p")) {
            pvpGame(player1, player2, computer, gameHistory);

        } else if (answer.equalsIgnoreCase("h")) {

            history(player1, player2, computer, gameHistory);
        } else if (answer.equalsIgnoreCase("q")) {

            userInput.close();
        } else if (answer.equalsIgnoreCase("c")) {
            cpuGame(player1, player2, computer, gameHistory);
        } else {
            return;
        }
        userInput.close();

    }

    public static void cpuGame(Player player1, Player player2, Computer computer, GameHistory gameHistory) {

        Scanner player1Pick = new Scanner(System.in);
        System.out.println("Player1 Pick Rock(r), Paper(p), Scissors(s) or History(h)");
        String p1Answer = player1Pick.nextLine();
        String p2Answer = computer.getMove();
        String[] correctInput = new String[]{"r", "s", "p", "h"};

        if (Arrays.asList(correctInput).contains(p1Answer) && Arrays.asList(correctInput).contains(p2Answer)) {
            if (p1Answer.equalsIgnoreCase("r") && p2Answer.equalsIgnoreCase("s")) {
                player1.setWins();
                System.out.println("Player1 wins");
                cpuGame(player1, player2, computer, gameHistory);
            } else if (p1Answer.equalsIgnoreCase("r") && p2Answer.equalsIgnoreCase("p")) {
                computer.setWins();
                System.out.println("Cpu wins");
                cpuGame(player1, player2, computer, gameHistory);
            } else if (p1Answer.equalsIgnoreCase("p") && p2Answer.equalsIgnoreCase("s")) {
                computer.setWins();
                System.out.println("Cpu wins");
                cpuGame(player1, player2, computer, gameHistory);
            } else if (p1Answer.equalsIgnoreCase("p") && p2Answer.equalsIgnoreCase("r")) {
                player1.setWins();
                System.out.println("Player1 wins");
                cpuGame(player1, player2, computer, gameHistory);
            } else if (p1Answer.equalsIgnoreCase("s") && p2Answer.equalsIgnoreCase("r")) {
                computer.setWins();
                System.out.println("Cpu wins");
                cpuGame(player1, player2, computer, gameHistory);
            } else if (p1Answer.equalsIgnoreCase("s") && p2Answer.equalsIgnoreCase("p")) {
                player1.setWins();
                System.out.println("Player1 wins");
                cpuGame(player1, player2, computer, gameHistory);
            } else if (p1Answer.equalsIgnoreCase("h")) {
                gameHistory.addMatchResult("Player 1", player1.getWins());
                gameHistory.addMatchResult("Computer", computer.getWins());
                history(player1, player2, computer, gameHistory);
            } else {
                System.out.println("Draw");
                cpuGame(player1, player2, computer, gameHistory);
            }
        } else {
            System.out.println("Incorrect Input");
            cpuGame(player1, player2, computer, gameHistory);
        }

    }

    public static void pvpGame(Player player1, Player player2, Computer computer, GameHistory gameHistory) {
        Scanner player1Pick = new Scanner(System.in);
        Scanner player2Pick = new Scanner(System.in);

        System.out.println("Player1 Pick Rock(r), Paper(p), Scissors(s) or History(h)");
        String p1Answer = player1Pick.nextLine();
        System.out.println("Player2 Pick Rock(r), Paper(p), Scissors(s) or History(h)");
        String p2Answer = player2Pick.nextLine();

        String[] correctInput = new String[]{"r", "s", "p", "h"};

        if (Arrays.asList(correctInput).contains(p1Answer) && Arrays.asList(correctInput).contains(p2Answer)) {
            if (p1Answer.equalsIgnoreCase("h") || p2Answer.equalsIgnoreCase("h")) {
                history(player1, player2, computer, gameHistory);
                pvpGame(player1, player2, computer, gameHistory);
            } else {
                if (p1Answer.equalsIgnoreCase("r") && p2Answer.equalsIgnoreCase("s")) {
                    player1.setWins();
                    gameHistory.addMatchResult("Player 1", player1.getWins());
                    System.out.println("Player1 wins");
                } else if (p1Answer.equalsIgnoreCase("r") && p2Answer.equalsIgnoreCase("p")) {
                    player2.setWins();
                    gameHistory.addMatchResult("Player 2", player2.getWins());
                    System.out.println("Player2 wins");
                } else if (p1Answer.equalsIgnoreCase("p") && p2Answer.equalsIgnoreCase("s")) {
                    player2.setWins();
                    gameHistory.addMatchResult("Player 2", player2.getWins());
                    System.out.println("Player2 wins");
                } else if (p1Answer.equalsIgnoreCase("p") && p2Answer.equalsIgnoreCase("r")) {
                    player1.setWins();
                    gameHistory.addMatchResult("Player 1", player1.getWins());
                    System.out.println("Player1 wins");
                } else if (p1Answer.equalsIgnoreCase("s") && p2Answer.equalsIgnoreCase("r")) {
                    player2.setWins();
                    gameHistory.addMatchResult("Player 2", player2.getWins());
                    System.out.println("Player2 wins");
                } else if (p1Answer.equalsIgnoreCase("s") && p2Answer.equalsIgnoreCase("p")) {
                    player1.setWins();
                    gameHistory.addMatchResult("Player 1", player1.getWins());
                    System.out.println("Player1 wins");
                } else {
                    System.out.println("Draw");
                }
                pvpGame(player1, player2, computer, gameHistory);
            }
        } else {
            System.out.println("Incorrect Input");
            pvpGame(player1, player2, computer, gameHistory);
        }
    }


    public static void history(Player player1, Player player2, Computer computer, GameHistory gameHistory) {
        System.out.println(gameHistory.getGameHistory());

        game(player1, player2, computer, gameHistory);
    }


}
