
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CCCS1SumGame{
    public static void main(String[] args) throws IOException{
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));

        String inputtedNumOfDays = input.readLine();
        int numOfDays = Integer.parseInt(inputtedNumOfDays);

        String inputtedSeasonResultsForTheSwifts = input.readLine();
        String[] inputSeasonResultsForTheSwifts = inputtedSeasonResultsForTheSwifts.split(" ");
        int[] seasonResultsForTheSwifts = new int[numOfDays];
        int swiftSum = 0;
        int semorsSum = 0;

        int numOfDaysTilTheyEqual = 0;

        for(int i = 0; i < numOfDays; i++){
            seasonResultsForTheSwifts[i] = Integer.parseInt(inputSeasonResultsForTheSwifts[i]);
        }

        String inputtedSeasonResultsForTheSemors = input.readLine();
        String[] inputSeasonResultsForTheSemors = inputtedSeasonResultsForTheSemors.split(" ");
        int[] seasonResultsForTheSemors = new int[numOfDays];

        for(int j = 0; j < numOfDays; j++){
            seasonResultsForTheSemors[j] = Integer.parseInt(inputSeasonResultsForTheSemors[j]);
        }

        for(int k = 0; k < numOfDays; k++){
            swiftSum += seasonResultsForTheSwifts[k] ;
            semorsSum += seasonResultsForTheSemors[k];

            if(swiftSum == semorsSum){
                numOfDaysTilTheyEqual = k + 1;
            }  
        }
        System.out.println(numOfDaysTilTheyEqual);
    }
}