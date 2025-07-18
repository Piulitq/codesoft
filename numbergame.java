 import java.util.Scanner;
import java.util.Random;

public class numbergame  {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Random rand = new Random();
        int score = 0;
        String playAgain="yes";

        System.out.println("Welcome to the Number Guessing Game!");

        do {
            int numberToGuess = rand.nextInt(100) + 1;
            int attempts = 5;
            boolean Correctly = false;

            System.out.println("\nI have selected a number between 1 and 100.");
            System.out.println("You have " + attempts + " attempts to guess it.");

            for (int i = 1; i <= attempts; i++) {
                System.out.print("Attempt " + i +  " Enter your guess: ");
                int guess = in.nextInt();

                if (guess == numberToGuess) {
                    System.out.println(" Correct! You've guessed the number in " + i + " attempt(s).");
                    score++;
                    Correctly = true;
                    break;
                } else if (guess < numberToGuess) {
                    System.out.println("Too low!");
                } else {
                    System.out.println("Too high!");
                }
            }

            if (!Correctly) {
                System.out.println(" You've used all attempts. The number was: " + numberToGuess);
            }

            System.out.print("Do you want to play another round (yes/no): ");
            playAgain = in.next();
        } while (playAgain.equalsIgnoreCase("yes"));

        System.out.println("\nGame Over! Your total score: " + score + " round(s) won.");
        System.out.println("Thanks for playing!");
    }
}


