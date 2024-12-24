package Java.OopsinJAVA;
import java.util.Scanner;
import java.util.Random;
public class ScissorPaperRock {
    public static void main(String[] args) {
//        0 is a Rock
        //1 is a Paper
        //2 is a Scissor
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter 0 for Rock,1 For paper,2 for a Scissor");
        int userInput=sc.nextInt();
        Random random=new Random();
        int comuterInput=random.nextInt(3);
        if(userInput==comuterInput){
            System.out.println("Draw");
        }
        else if(userInput==0 && comuterInput==2 || userInput==1 && comuterInput==0 || userInput==2 && comuterInput==1){
            System.out.println("You win...!");
        }
        else{
            System.out.println("You lose");
        }
    }
}
