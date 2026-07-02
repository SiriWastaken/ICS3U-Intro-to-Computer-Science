import java.util.Scanner;

public class J2VoteCount{
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        int aVotes = 0;
        int bVotes = 0;
        int numOfVotes = input.nextInt();
        char[] votes = input.next().toCharArray();


        for(int i = 0; i >= votes.length; i++){
            if(votes[i] == 'A'){
                aVotes++;
                
            }
            else if(votes[i] == 'B'){
                bVotes++;
            }
        }

        if(aVotes > bVotes){
            System.out.println("A");
        }
        else if(aVotes < bVotes){
            System.out.println("B");
        }
        else if(aVotes == bVotes){
            System.out.println("Tie");
        }
    }
}