import java.util.Scanner;
import java.util.Random;

Public class ChangeMysteryNumber {
    public static void main(String[] arg){
     Scanner scanner = new Scanner(System.in);
     Random random = new Random();

     int mysteryNumber = random.nextInt(10);
     int guess;
     int totalguesses = 0;
     int wrongCoun = 0;
      
     System.out.println("Guess a number between 1 and 10.");
   
      while (true) {
            System.out.print("Enter your guess: ");
               guess = scanner.nextInt();
             totalguesses++;

            if (guess == mysteryNumber) {
                System.out.println("Congratulations!:" + you won);
                
            } else if (guess < numberToGuess) {
                System.out.println("Too low! try again.");
            } else {
                System.out.println("Too high! try again");


       }


    }

}