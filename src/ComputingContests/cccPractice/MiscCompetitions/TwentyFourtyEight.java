import java.io.*;
import java.util.*;

public class TwentyFourtyEight {

    public static void main(String[] args) throws Exception {

        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));

        // read number of test cases
        int T = Integer.parseInt(input.readLine());

        while (T-- > 0) {

            // read initial 4x4 board
            int[][] board = readBoard(input);

            // run BFS/DFS over all reachable states
            int answer = search(board);

            // print largest tile found
            System.out.println(answer);
        }
    }

    static int search(int[][] start) {

        // queue for exploring states (BFS)
        Queue<int[][]> q = new LinkedList<>();

        // set to store visited boards
        HashSet<String> visited = new HashSet<>();

        // track maximum tile seen so far
        int best = 0;

        // add starting state to queue
        // mark it as visited

        while (queue not empty) {

            // get next board state

            // update best tile

            // try all 4 directions:
            for (each direction) {

                // generate next board after move

                // if board changes AND not visited:
                    // add to queue
                    // mark visited
            }
        }

        // return best tile found
        return best;
    }

    static int[][] readBoard(BufferedReader input) throws Exception {

        // create 4x4 board

        // loop through rows
            // read line
            // parse values into board

        // return board
    }

    static int[][] move(int[][] board, int dir) {

        // copy board (do not modify original)

        // dir = up/down/left/right

        // step 1: shift tiles toward direction

        // step 2: merge equal adjacent tiles (only once per move)

        // step 3: shift again after merging

        // return new board
    }

    static int[][] copy(int[][] board) {

        // create new 4x4 array

        // copy all values

        // return copy
    }

    static String encode(int[][] board) {

        // convert board into unique string representation

        // used for HashSet lookup

        // return encoded string
    }

    static int largest(int[][] board) {

        // scan all cells

        // track maximum value

        // return max tile
    }
}