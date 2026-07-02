import java.util.Scanner;
public class S1EnglishOrFrench {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int textNumLines = input.nextInt();
        int countT = 0;
        int countS = 0;


        for(int i = 0; i <= textNumLines; i++){
            String textLine = input.nextLine();
            String[] characterArray = textLine.split("");
            for(int k = 0; k < characterArray.length; k++){
                if(characterArray[k].equals("T") || characterArray[k].equals("t")){
                    ++countT;
                }
                else if(characterArray[k].equals("S") || characterArray[k].equals("s")){
                    ++countS;
                }
            }
        }
        if(countT > countS){
            System.out.println("English");
        }
        else if(countS > countT || countS == countT){
            System.out.println("French");
        }

        input.close();
    }
}
