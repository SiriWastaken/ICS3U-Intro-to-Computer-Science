package cccPractice;
/* Name: CCC J2 - Vote Count
** Author: Sri Ganty
** Date: July 6, 2026
** Description: Counts votes for singers A and B 
** by reading an array with the number of votes 
** and incrementing the vote count variables for A and B. 
*/
import java.util.Scanner;
public class J2VoteCount{
    /** Reads the number of votes in an array, 
     * increments if they are a certain character, 
     * and print out which value occurs more, or, if it's a tie.
     * 
     * @param args, @return type void 
     */
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        int aVotes = 0;
        int bVotes = 0;

        // Assigning the input's value to the size of the array, as well as storing the values of A and B.
        char[] votes = input.next().toCharArray();

        // Iterates over the number of values in the array (only the valid bounds, to avoid an IndexOutOfBoundsException).
        for (int i = 0; i < votes.length; i++){
            // If the chracter in the votes array at i's index is A or B, increment the A or B value to match.
            if(votes[i] == 'A'){
                aVotes++;
                
            }
            else if(votes[i] == 'B'){
                bVotes++;
            }
        }

        // Based on the values of the incremented variables (aVotes and bVotes), print out "A", "B", or "Tie", based on the result.
        if(aVotes > bVotes){
            System.out.println("A");
        }
        else if(aVotes < bVotes){
            System.out.println("B");
        }
        else if(aVotes == bVotes){
            System.out.println("Tie");
        }

        input.close();
    }
}