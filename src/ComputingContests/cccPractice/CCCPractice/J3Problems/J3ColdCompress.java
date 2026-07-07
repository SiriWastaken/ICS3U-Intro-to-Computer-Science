import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class J3ColdCompress {
    public static void main(String[] args) throws IOException {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));

        StringBuilder outputString = new StringBuilder();

        int numOfLines = Integer.parseInt(input.readLine());
        char[] currentLine = new char[80];

        for(int i = 0; i < numOfLines; i++){
            currentLine = input.readLine().toCharArray();
        }

        for(int j = 0; j < currentLine.length; j++){
            
        }        

        // Count the number of characters in a row, store it, and add that as well as the currentChar to the StringBuilder

        // Once all of those lines of input have been done, print out the StringBuiler 

    }
    
}
