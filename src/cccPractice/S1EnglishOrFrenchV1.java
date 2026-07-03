package cccPractice;
/* Author: Sri Ganty
 * Date: July 6, 2026
 * Problem: CCC '11 S1 - English or French
 * Description: Counts occurrences of T/t and S/s across multiple lines
 * to determine whether the text is English or French.
 */
import java.util.Scanner;

public class S1EnglishOrFrenchV1 {
      /**
     * Main method reads input, processes characters, and determines language. No external methods were used for this program.
     * @param args command-line arguments 
     * @return type void
     */
    public static void main(String[] args) {

        // Scanner used for input handling.
        Scanner input = new Scanner(System.in);

        // Number of text lines needed to be parsed.
        int textNumLines = Integer.parseInt(input.nextLine());
        
        int countT = 0;
        int countS = 0;

        // Process each and every line of input.
        for(int i = 0; i < textNumLines; i++){
            String textLine = input.nextLine();
            
            // Split the line into individual characters.
            String[] characterArray = textLine.split("");

            // For loop to count T and S occurances and increments their values.
            for(int k = 0; k < characterArray.length; k++){
                if(characterArray[k].equals("T") || characterArray[k].equals("t")){
                    ++countT;
                }
                else if(characterArray[k].equals("S") || characterArray[k].equals("s")){
                    ++countS;
                }
            }
        }

        // Compare the incremented values for each occurance and print the right language based on the cases the CEMC provided.
        if(countT > countS){
            System.out.println("English");
        }
        else if(countS > countT || countS == countT){
            System.out.println("French");
        }

        input.close();
    }
}