package cccPractice;

import java.util.Scanner;
public class CCCJ3Art {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        int maxX = 100, maxY = 100;
        int minX = -1, minY = -1;
        String[] coords;
        String[] coordsNew;

        int numOfSplashes = input.nextInt();

        String tokenNew = input.next();
            coordsNew = tokenNew.split(",");

            int a = Integer.parseInt(coordsNew[0]);
            int b = Integer.parseInt(coordsNew[1]);

            minX = a;
            maxX = a;
            minY = b;
            maxY = b;

        for(int i = 0; i < numOfSplashes - 1; i++){

            String token = input.next();
            coords = token.split(",");

            int x = Integer.parseInt(coords[0]);
            int y = Integer.parseInt(coords[1]);

            if(x < minX) minX = x;
            if(x > maxX) maxX = x;
            if(y < minY) minY = y;
            if(y > maxY) maxY = y;
        }
        --minX;
        --minY;
        ++maxX;
        ++maxY;

        System.out.println(minX + "," + minY);
        System.out.println(maxX + "," + maxY);

        // Scanner for user input
        // A for loop to process where the splashes of paint are
        // Then, using those splashes of paint, store them somewhere
        // After that, see what the 2 edge cases of the x and y axis are and add 1 to that
        // Then, print out the 2 x and y values for the top and the bottom frame 
        // Edge cases I'm worried abt
    }
    
}
