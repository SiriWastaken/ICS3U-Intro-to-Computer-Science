/* Author: Sri Ganty
 * Date: Monday, July 6, 2026
 * Problem: CCC '11 S1 - English or French
 * Description: Counts occurrences of T/t and S/s across multiple lines
 * to determine whether the text is English or French.
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class S1EnglishOrFrench {
    /**
     * Main method reads input, processes characters, and determines language. No external methods were used for this program.
     * @param args command-line arguments 
     * @return type void
     * @throws IOException per class Throwable
     */
    public static void main(String[] args) throws IOException {
        // BufferedReader used for faster input handling than a typical Scanner would.
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));

        int textNumLines = Integer.parseInt(input.readLine());
        int countT = 0;
        int countS = 0;

        for (int i = 0; i < textNumLines; i++) {
            String textLine = input.readLine();
            
            // split("") creates an array of single-character strings
            String[] characterArray = textLine.split("");

            for (int k = 0; k < characterArray.length; k++) {
                if (characterArray[k].equals("T") || characterArray[k].equals("t")) {
                    ++countT;
                } else if (characterArray[k].equals("S") || characterArray[k].equals("s")) {
                    ++countS;
                }
            }
        }

        // Per CEMC/CCC cases: English if T > S, French if S >= T
        if (countT > countS) {
            System.out.println("English");
        } else {
            System.out.println("French");
        }
    }
}