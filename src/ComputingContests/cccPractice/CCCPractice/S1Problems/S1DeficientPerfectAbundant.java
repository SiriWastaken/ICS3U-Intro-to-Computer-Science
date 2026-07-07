import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class S1DeficientPerfectAbundant{
    public static void main(String[] args) throws IOException{
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        int numOfNumbers = Integer.parseInt(input.readLine());

        for(int i = 0; i < numOfNumbers; i++){
            int currentNumber = Integer.parseInt(input.readLine());
            int sum = 0;
            for(int d = 1; d <= currentNumber/2; d++){
                if(currentNumber % d == 0) sum += d;
            }
            if(currentNumber == 4 || currentNumber == 28 || currentNumber == 496 || currentNumber == 8128){
                System.out.println(currentNumber + " is a perfect number.");
            } else if(sum < currentNumber){
                System.out.println(currentNumber + " is a deficient number.");
            } else {
                System.out.println(currentNumber + " is an abundant number.");
            }
        }

    }
}