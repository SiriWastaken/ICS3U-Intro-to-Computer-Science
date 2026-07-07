import java.util.Scanner;


public class TicTacToe {
    public static int[][] gameBoard = new int[3][3];

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome! Player 1 is X and Player 2 is O.");
        boolean hasWon = false;

        while (!hasWon) {
            System.out.println("Player 1: Enter row and column (0-2) separated by a space:");
            String[] player1Move = input.nextLine().trim().split(" +");
            int player1Row = Integer.parseInt(player1Move[0]);
            int player1Col = Integer.parseInt(player1Move[1]);
            if (gameBoard[player1Row][player1Col] != 0){
                System.out.println("That part of the board is already taken!");
                continue; 
            }

            gameBoard[player1Row][player1Col] = 1;
            printBoard();

            if (checkWin(1)) {
                System.out.println("Player 1 wins!");
                hasWon = true;
                break;
            }

            System.out.println("Player 2: Enter row and column (0-2) separated by  a space:");
            String[] player2Move = input.nextLine().trim().split(" +");
            int player2Row = Integer.parseInt(player2Move[0]);
            int player2Col = Integer.parseInt(player2Move[1]);
            if (gameBoard[player2Row][player2Col] != 0) {
                System.out.println("That part of the board is already taken! It's player 1's turn.");
                continue; 
            }

            gameBoard[player2Row][player2Col] = 2;
            printBoard();

            if (checkWin(2)) {
                System.out.println("Player 2 wins!");
                hasWon = true;
                break;
            }
        }
    }
    public static void printBoard() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                int v = gameBoard[i][j];
                char ch = v == 1 ? 'X' : (v == 2 ? 'O' : '.');
                System.out.print(ch + "-");
            }
            System.out.println();
        }
    }
    public static boolean checkWin(int player) {
        for (int i = 0; i < 3; i++) {
            if (gameBoard[i][0] == player && gameBoard[i][1] == player && gameBoard[i][2] == player) {
                return true;
            }
        }
        for (int j = 0; j < 3; j++) {
            if (gameBoard[0][j] == player && gameBoard[1][j] == player && gameBoard[2][j] == player) {
                return true;
            }
        }
        if (gameBoard[0][0] == player && gameBoard[1][1] == player && gameBoard[2][2] == player) {
            return true;
        }
        if (gameBoard[0][2] == player && gameBoard[1][1] == player && gameBoard[2][0] == player) {
            return true;
        }
        return false;
    }

}