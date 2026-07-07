import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class CCCS2HighTideLowTide {
    public static void main(String[] args) throws IOException, NumberFormatException {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));

        String inputtedNumOfInputs = input.readLine();
        int numOfInputs = Integer.parseInt(inputtedNumOfInputs);

        int[] tideMeasurments = new int[numOfInputs];

        int lowSize = (numOfInputs + 1) / 2;

        String[] parts = input.readLine().split(" ");
        for (int i = 0; i < numOfInputs; i++) {
            tideMeasurments[i] = Integer.parseInt(parts[i]);
        }
        Arrays.sort(tideMeasurments);

        int[] lowMeasurments = Arrays.copyOfRange(tideMeasurments, 0, lowSize);
        int[] highMeasurments = Arrays.copyOfRange(tideMeasurments, lowSize, numOfInputs);
        int[] sortedArrayOfElements = new int[numOfInputs];
        int lowIndex = lowMeasurments.length - 1;
        int highIndex = 0;

        for (int j = 0; j < numOfInputs; j += 2) {
            sortedArrayOfElements[j] = lowMeasurments[lowIndex--];

            if (j + 1 < numOfInputs) {
                sortedArrayOfElements[j + 1] = highMeasurments[highIndex++];
            }
        }

        for (int k = 0; k < numOfInputs; k++) {
            System.out.print(sortedArrayOfElements[k] + " ");
        }

    }
}
