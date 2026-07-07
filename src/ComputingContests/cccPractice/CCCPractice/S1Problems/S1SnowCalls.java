import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class S1SnowCalls {

    static char[][] numpad = {
        {'A', 'B', 'C'},      // Row 0 maps to '2'
        {'D', 'E', 'F'},      // Row 1 maps to '3'
        {'G', 'H', 'I'},      // Row 2 maps to '4'
        {'J', 'K', 'L'},      // Row 3 maps to '5'
        {'M', 'N', 'O'},      // Row 4 maps to '6'
        {'P', 'Q', 'R', 'S'}, // Row 5 maps to '7'
        {'T', 'U', 'V'},      // Row 6 maps to '8'
        {'W', 'X', 'Y', 'Z'}  // Row 7 maps to '9'
    };

    public static void main(String[] args) throws IOException {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        
        String inputtedNumOfLines = input.readLine();
        int numOfLines = parseInteger(inputtedNumOfLines);

        for (int i = 0; i < numOfLines; i++) {
            String line = input.readLine();
            String result = "";
            int digitsFound = 0;

            for (int c = 0; c < line.length() && digitsFound < 10; c++) {
                char letter = line.charAt(c);

                if (letter == '-') {
                    continue;
                }

                if (digitsFound == 3 || digitsFound == 6) {
                    result += "-";
                }

                if (letter >= 'A' && letter <= 'Z') {
                    result += getDigitFromNumpad(letter);
                } else {
                    result += letter;
                }

                digitsFound++;
            }

            System.out.println(result);
        }
    }

    public static int getDigitFromNumpad(char letter) {
        for (int row = 0; row < numpad.length; row++) {
            for (int col = 0; col < numpad[row].length; col++) {
                if (numpad[row][col] == letter) {
                    return row + 2;
                }
            }
        }
        return 0; 
    }

    public static int parseInteger(String str) {
        int number = 0;
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (c >= '0' && c <= '9') {
                number = number * 10 + (c - '0');
            }
        }
        return number;
    }
}