import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CCCSimpleEncryption {
    public static void main(String[] args) throws IOException {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        String keyword = input.readLine();
        String message = input.readLine();
        String cleanedMessage = "";
        
        for (int i = 0; i < message.length(); i++) {
            if (Character.isLetter(message.charAt(i))) {
                cleanedMessage += message.charAt(i);
            }
        }

        String encrypted = "";
        
        for (int i = 0; i < cleanedMessage.length() ; i++) {
            char keyChar = keyword.charAt(i % keyword.length());
            int shift = keyChar - 'A';
            char messageChar = cleanedMessage.charAt(i);
            char encryptedChar = (char) ((messageChar - 'A' + shift) % 26 + 'A');
            encrypted += encryptedChar;
        }

        System.out.print(encrypted);

    }

}