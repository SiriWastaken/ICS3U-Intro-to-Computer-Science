package ComputingContests.cccPractice.S1Problems;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CCCS22011MCQ {
    public static void main(String[] args) throws IOException{
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));

        String inputtedNumOfAnswers = input.readLine();
        int numOfAnswers = Integer.parseInt(inputtedNumOfAnswers);

        String inputtedAnswer;
        char[] charArrayStudentAnswers = new char[numOfAnswers];
        String teacherAnswers;
        char[] charArrayTeacherAnswers = new char[numOfAnswers];

        int correctTotal = 0;
        

        for (int i = 0; i < numOfAnswers; i++) {
            charArrayStudentAnswers[i] = input.readLine().charAt(0);
        }

       for (int j = 0; j < numOfAnswers; j++) {
        charArrayTeacherAnswers[j] = input.readLine().charAt(0);
        }

        for (int k = 0; k < numOfAnswers; k++) {
            if (charArrayStudentAnswers[k] == charArrayTeacherAnswers[k]) {
                 correctTotal++; 
            }
        }

        System.out.println(correctTotal);

    }
    
}
