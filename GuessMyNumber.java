import java.util.Scanner;pr
import java.util.Random;

public class GuessMyNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int numberToGuess = random.nextInt(10) + 1;
        int maxTries = 3;
        int tries = 0;

        System.out.println("Guess a number between 1 and 10. You have 3 tries.");

        while (tries < maxTries) {
            System.out.print("Enter your guess: ");
            int guess = scanner.nextInt();
            tries++;

            if (guess == numberToGuess) {
                System.out.println("Correct! You win!");
                
            } else if (guess < numberToGuess) {
                System.out.println("Too low!");
            } else {
                System.out.println("Too high!");
            }

            if (tries == maxTries) {
                System.out.println("Game over! The correct number was: " + numberToGuess);
            }
        }

    }
}