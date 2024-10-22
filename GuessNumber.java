import java.util.Scanner;
import java.util.Random;

public class GuessNumber{
    public static void main(String[] args){
        Scanner scr = new Scanner(System.in);
        Random rand = new Random();
        int randomNumber = rand.nextInt(100) + 1;

        while(true){
            System.out.print("Guess the number: ");
            int userGuess = scr.nextInt();
    
            if(randomNumber == userGuess){
                System.out.println("Correct! You win!");
                break;
            }else if(randomNumber > userGuess)
                System.out.println("Nope! The number is higher");
            else
                System.out.println("Nope! The number is lower");
        }

        // The same code can be written using do while loop. The only difference between while and do while loops is that do while loop is always guaranteed to run at least once since it runs the code and then checks the condition.
       
        // do{
        //     System.out.print("Guess the number: ");
        //     int userGuess = scr.nextInt();
    
        //     if(randomNumber == userGuess){
        //         System.out.println("Correct! You win!");
        //         break;
        //     }else if(randomNumber > userGuess)
        //         System.out.println("Nope! The number is higher");
        //     else
        //         System.out.println("Nope! The number is lower");
        // }
        // while(true);

        // Slightly different way to do the same thing

        // boolean didUserGuessRight = false;
        // while(!didUserGuessRight){
        //     System.out.print("Guess the number: ");
        //     int userGuess = scr.nextInt();
    
        //     if(randomNumber == userGuess){
        //         System.out.println("Correct! You win!");
        //         didUserGuessRight = true;
        //     }else if(randomNumber > userGuess)
        //         System.out.println("Nope! The number is higher");
        //     else
        //         System.out.println("Nope! The number is lower");
        // }
    }
}