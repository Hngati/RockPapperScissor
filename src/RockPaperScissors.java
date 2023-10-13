import java.util.Scanner;

    public class RockPaperScissors {

    public static void main(String[] args) {
                Scanner scanner = new Scanner(System.in); // scanner for input from user
                String playA, playB; // store moves
                boolean playAgain; // play again

                do {
                    playA = playerMove("Player A", scanner);
                    playB = playerMove("Player B", scanner);

                    String result = findWinner(playA, playB); // shows winners and results
                    System.out.println(result);

                    System.out.print("Would You Like To Play again? (Y/N): "); // ask if player wants to play again yes or no
                    String playAgainInput = scanner.nextLine().trim();
                    playAgain = playAgainInput.equalsIgnoreCase("Y"); // if yes then game continues
                } while (playAgain); // user keeps playing
            }

            static String playerMove(String player, Scanner scanner) {
                String choice;
                do {
                    System.out.print(player + ", enter your move (R/P/S): "); // asks for user move
                    choice = scanner.nextLine().trim().toUpperCase();
                } while (validMove(choice)); // repeating until a valid input
                return choice;
            }

        static boolean validMove(String move) { // check if input is valid
            return !move.equals("R") & !move.equals("P") & !move.equals("S");
        }
            static String findWinner(String playA, String playB) { // tells you what player won
                if (playA.equals(playB)) {
                    return "Rock vs Rock it's a Tie!";
                } else if ((playA.equals("R") & playB.equals("S")) || (playA.equals("P") & playB.equals("R")) || (playA.equals("S") & playB.equals("P"))) {
                    return "Player A wins! " + winnerMessage(playA, playB); // player B lose
                } else {
                    return "Player B wins! " + winnerMessage(playB, playA); // player A lose
                }
            }

            static String winnerMessage(String winner, String loser) { //explaining how the user won
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
