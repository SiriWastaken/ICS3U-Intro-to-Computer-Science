package ComputingContests.cccPractice.S1Problems;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class CCCS1SprinterSpeed2020 {
    public static void main(String[] args) throws IOException {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));

        int numOfInputs = Integer.parseInt(input.readLine());
        
        int[][] data = new int[numOfInputs][2];

        for (int i = 0; i < numOfInputs; i++) {
            String[] tokens = input.readLine().split(" ");
            data[i][0] = Integer.parseInt(tokens[0]); 
            data[i][1] = Integer.parseInt(tokens[1]); 
        }

        Arrays.sort(data, (a, b) -> Integer.compare(a[0], b[0]));

        double maxSpeed = 0;
        for (int i = 0; i < numOfInputs - 1; i++) {
            double distance = Math.abs(data[i + 1][1] - data[i][1]);
            double timeDiff = data[i + 1][0] - data[i][0];
            
            double speed = distance / timeDiff;
            if (speed > maxSpeed) {
                maxSpeed = speed;
            }
        }

        System.out.println(maxSpeed);
    }
}