import java.io.*;
import java.util.*;

public class ParsingCSV {

    public static void main(String[] args) throws IOException {

        BufferedReader input = new BufferedReader(new FileReader("src/FinalProject/questions.csv"));

        ArrayList<String[]> questions = new ArrayList<>();

        input.readLine();

        String line;

        while ((line = input.readLine()) != null) {
            String[] data = line.split(",");
            questions.add(data);
        }

        input.close();

        Random random = new Random();

        for (int i = 0; i < 5; i++) {

            String[] question = questions.get(random.nextInt(questions.size()));

            System.out.println("--------------------");

            System.out.println("Question: " + question[0]);

            System.out.println("A: " + question[1]);
            System.out.println("B: " + question[2]);
            System.out.println("C: " + question[3]);
            System.out.println("D: " + question[4]);

            System.out.println("Correct Answer: " + question[5]);
            System.out.println("Difficulty: " + question[6]);
            System.out.println("Time Limit: " + question[7] + " seconds");
        }
    }
}