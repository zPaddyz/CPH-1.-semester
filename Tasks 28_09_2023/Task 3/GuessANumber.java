import java.util.Random;
import java.util.Scanner;


public class GuessANumber {
    private static int rnd_number;


    public static void main(String[] args) {
        // pick a random number
        Random random = new Random();
        rnd_number = random.nextInt(100) + 1;
        System.out.println( "I'm thinking of a number between 1 and 100 (including both).");
        System.out.println( "Can you guess what it is?...");
        makeAGuess();
    }


    private static void makeAGuess(){
        // Create a Scanner object
        // Read user input
        Scanner scanner = new Scanner(System.in);
        int guess = scanner.nextInt();
        //if(scanner.hasNextDouble()){
            if(guess == rnd_number){
                System.out.println("Your guess is correct!");
            } else if(guess > rnd_number) {
                System.out.println("Your guess is a bit too high");
                makeAGuess();
            } else if(guess < rnd_number) {
                System.out.println("Your guess is a bit too low");
                makeAGuess();
            }

        //}
        //use hasNextDouble to check if input is numeric,
        // if so...
        //   Compare it with the random number
        //   Let the user know the result of the comparison
        //   Let the user try again by calling this method recursively
        //   Help the user by revealing wether the guess was lower or higher than the target number
        // if input was not numeric show an error message and call this method recursively

    }


}