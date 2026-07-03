package cccPractice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CCCS107Voting {
    public static void main(String[] args) throws IOException {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));

        int numberOfDates = Integer.parseInt(input.readLine());

        for (int i = 0; i < numberOfDates; i++) {

            String[] date = input.readLine().split(" ");

            int year = Integer.parseInt(date[0]);
            int month = Integer.parseInt(date[1]);
            int day = Integer.parseInt(date[2]);

            if (year < 1989) {
                System.out.println("Yes");
            }
            else if (year > 1989) {
                System.out.println("No");
            }
            else {

                if (month < 2) {
                    System.out.println("Yes");
                }
                else if (month > 2) {
                    System.out.println("No");
                }
                else { 

                    if (day <= 27) {
                        System.out.println("Yes");
                    }
                    else {
                        System.out.println("No");
                    }
                }
            }
        }
    }
}