/*The computer picks a random number between 1 and 100.
You keep guessing until you get it right.

 */

import java.util.Scanner;
import java.util.Random;
public class Exercise02 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        Random rand = new Random();

        int numberToGuess= rand.nextInt(100) + 1; //1 to 100
        int guess = 0;
        int attempts = 0;
        System.out.println("Welcome to the guess the number game !");
        System.out.println("I'm thinking of a number between 1 and 100.try to guess it!");
        while(guess != numberToGuess){
            System.out.println("Enter your guess:  ");
            guess= sc.nextInt();
            attempts  ++;

            if(guess< numberToGuess){
                System.out.println("Too low!  try again.");

            }else if (guess>numberToGuess){
                System.out.println("Too high! try again. ");

            } else {
                System.out.println("\"uD83C\uDF89 Congratulations! You guessed the number in " +  attempts+ "  attempts.");
            }
        }
sc.close();
    }
}
