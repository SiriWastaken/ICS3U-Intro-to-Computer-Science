import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class J3ColdCompress {
    public static void main(String[] args) throws IOException {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));

        int numOfLines = Integer.parseInt(input.readLine());
        char[] currentLine = new char[80];

        for (int i = 0; i < numOfLines; i++) {
            String line = input.readLine();

            StringBuilder outputString = new StringBuilder();

            char currentChar = line.charAt(0);
            int count = 1;

            for (int j = 1; j < line.length(); j++) {
                if (line.charAt(j) == currentChar) {
                    count++;
                } else {
                    outputString.append(count).append(" ").append(currentChar).append(" ");
                    currentChar = line.charAt(j);
                    count = 1;
                }
            }            
            outputString.append(count).append(" ").append(currentChar);

            System.out.println(outputString);
    }
}
}