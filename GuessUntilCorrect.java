import java.util.Scanner;
import java.util.Random;

public class GuessUntilCorrect {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int numberToGuess = random.nextInt(10) + 1;
        int guess;

        System.out.println("Guess a number between 1 and 10.");

        while (true) {
            System.out.print("Enter your guess: ");
               guess = scanner.nextInt();

            if (guess == numberToGuess) {
                System.out.println("Congratulations!:" + numberToGuess);
                
            } else if (guess < numberToGuess) {
                System.out.println("Too low! try again.");
            } else {
                System.out.println("Too high! try again");
           
            }
        }

    }
}  