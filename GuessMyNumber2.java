import java.util.Scanner;
import java.util.Random;

public class GuessMyNumber2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int numberToGuess = random.nextInt(10) + 1;
        int maxTries = 20;
        int tries = 0;

        System.out.println("Guess a number between 1 and 10.");

        while (tries < maxTries) {
            System.out.print("Enter your guess: ");
            int guess = scanner.nextInt();
            tries++;

            if (guess == numberToGuess) {
                System.out.println("Congratulations!:" + numberToGuess);
                
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