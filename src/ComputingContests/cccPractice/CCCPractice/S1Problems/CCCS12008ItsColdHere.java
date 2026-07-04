package ComputingContests.cccPractice.S1Problems;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class CCCS12008ItsColdHere {
    public static void main(String[] args) throws IOException{
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        HashMap<String, Integer> temperatures = new HashMap<>();

        while(true){
            String line = input.readLine();
            String[] parts = line.split(" ");

            String city = parts[0];
            int temp = Integer.parseInt(parts[1]);

            temperatures.put(city, temp);

            if (city.equals("Waterloo")) {
                break;
            }
        }

        String coldestCity = "";
        int minTemp = Integer.MAX_VALUE;

         for (Map.Entry<String, Integer> entry : temperatures.entrySet()) {
                if (entry.getValue() < minTemp) {
                    minTemp = entry.getValue();
                    coldestCity = entry.getKey();
                    }
            }
        
        System.out.println(coldestCity);

    }
    
}

