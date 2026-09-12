package main.java.week_1.class_work;

import java.util.Random;
import java.util.Scanner;

public class RockPaperScissors {

    static String playRound(String playerMove, String computerMove) {
        if (playerMove.equals(computerMove)) {
            return "Draw";
        }

        if ((playerMove.equals("Rock") && computerMove.equals("Scissors")) ||
            (playerMove.equals("Paper") && computerMove.equals("Rock")) ||
            (playerMove.equals("Scissors") && computerMove.equals("Paper"))) {
            return "Player Wins";
        }

        return "Computer Wins";
    }

    static String generateComputerMove(Random random) {
        String[] moves = {"Rock", "Paper", "Scissors"};
        return moves[random.nextInt(moves.length)];
    }

    static String capitalizeMove(String move) {
        return move.substring(0, 1).toUpperCase()
                + move.substring(1).toLowerCase();
    }

    static void printScoreboard(String[] playerMoves,
                                String[] computerMoves,
                                String[] results) {

        System.out.println("\nRound | Player Move | Computer Move | Result");

        for (int i = 0; i < playerMoves.length; i++) {
            System.out.printf("%-5d | %-11s | %-13s | %s%n", 
                (i + 1), playerMoves[i], computerMoves[i], results[i]);
        }
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int numberOfRounds = 5;
        int wins = 0;
        int losses = 0;
        int draws = 0;

        String[] playerMoves = new String[numberOfRounds];
        String[] computerMoves = new String[numberOfRounds];
        String[] results = new String[numberOfRounds];

        for (int round = 0; round < numberOfRounds; round++) {

            System.out.print("Round " + (round + 1)
                    + " - Enter Rock, Paper, or Scissors: ");

            String playerMove = scanner.nextLine().trim();

            if (!playerMove.equalsIgnoreCase("Rock")
                    && !playerMove.equalsIgnoreCase("Paper")
                    && !playerMove.equalsIgnoreCase("Scissors")) {

                System.out.println("Invalid move. Try again.");
                round--;
                continue;
            }

            playerMove = capitalizeMove(playerMove);

            String computerMove = generateComputerMove(random);
            String result = playRound(playerMove, computerMove);

            playerMoves[round] = playerMove;
            computerMoves[round] = computerMove;
            results[round] = result;

            System.out.println("Computer: " + computerMove);
            System.out.println("Result: " + result);
            System.out.println();

            if (result.equals("Player Wins")) {
                wins++;
            } else if (result.equals("Computer Wins")) {
                losses++;
            } else {
                draws++;
            }
        }

        printScoreboard(playerMoves, computerMoves, results);

        double winPercentage = (wins * 100.0) / numberOfRounds;

        System.out.println("\nWins: " + wins);
        System.out.println("Losses: " + losses);
        System.out.println("Draws: " + draws);
        System.out.printf("Win Percentage: %.1f%%%n", winPercentage);

        scanner.close();
    }
}

