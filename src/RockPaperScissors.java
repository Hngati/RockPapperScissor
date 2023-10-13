import java.util.Scanner;

    public class RockPaperScissors {

    public static void main(String[] args) {
                Scanner scanner = new Scanner(System.in);
                String playA, playB;
                boolean playAgain;

                do {
                    playA = playerMove("Player A", scanner);
                    playB = playerMove("Player B", scanner);

                    String result = findWinner(playA, playB);
                    System.out.println(result);

                    System.out.print("Would You Like To Play again? (Y/N): ");
                    String playAgainInput = scanner.nextLine().trim();
                    playAgain = playAgainInput.equalsIgnoreCase("Y");
                } while (playAgain);
            }

            static String playerMove(String player, Scanner scanner) {
                String choice;
                do {
                    System.out.print(player + ", enter your move (R/P/S): ");
                    choice = scanner.nextLine().trim().toUpperCase();
                } while (validMove(choice));
                return choice;
            }

        static boolean validMove(String move) {
            return !move.equals("R") & !move.equals("P") & !move.equals("S");
        }
            static String findWinner(String playA, String playB) {
                if (playA.equals(playB)) {
                    return "Rock vs Rock it's a Tie!";
                } else if ((playA.equals("R") & playB.equals("S")) || (playA.equals("P") & playB.equals("R")) || (playA.equals("S") & playB.equals("P"))) {
                    return "Player A wins! " + winnerMessage(playA, playB);
                } else {
                    return "Player B wins! " + winnerMessage(playB, playA);
                }
            }

            static String winnerMessage(String winner, String loser) {
                if (winner.equals("R") & loser.equals("S")) {
                    return "Rock breaks Scissors";
                } else if (winner.equals("P") & loser.equals("R")) {
                    return "Paper covers Rock";
                } else if (winner.equals("S") & loser.equals("P")) {
                    return "Scissors cuts Paper";
                } else {
                    return "";
                }
            }
        }
