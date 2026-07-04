import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class CCCS1CoolNumbers {
    public static void main(String[] args) throws IOException{
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));

        String inputNumberOne = input.readLine();
        int numberOne = Integer.parseInt(inputNumberOne);

        String inputNumberTwo = input.readLine();
        int numberTwo = Integer.parseInt(inputNumberTwo);
        int coolNumberCount = 0;

        int checkingNumberOne = (int)Math.sqrt(numberOne);
        int stepTwoCheckingNumberOne = Math.round(checkingNumberOne);

          for (int i = numberOne; i <= numberTwo; i++) {
            double sqrt = Math.sqrt(i);
            double cbrt = Math.cbrt(i);
            boolean isSquare = sqrt == (int) sqrt;
            boolean isCube = cbrt == (int) cbrt;
            if (isSquare && isCube) {
                coolNumberCount++;
            }
        }
        System.out.println(coolNumberCount);

        // Take the 2 numbers as an input (This is an easier S1 in this sense because we don't need a for loop to accept input, and we are
        // ...GUARANTEED 2 lines of input and ONLY 2 lines of input)

        // After input, use Math.sqrt(), and then Math.round(), and then multiply the inptted number by itself to see if it yields the same reuslt.

        // Now, for cube roots, we do the EXACT same thing but with Math.cbrt(). and multiply it by itself THREE times

        // Then, if the number is both a square and cube root, increment a counter
        // Finally, output said counter
    }
    
}
