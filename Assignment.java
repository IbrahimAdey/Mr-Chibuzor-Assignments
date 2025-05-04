import java.util.Scanner;

public class Assignment {

    public static void userChoice(int number) {
        if (Kata.isEven(number)) {
            System.out.println("True:" + number + " is even.");
        } else {
            System.out.println("False:" + number + " is odd.");
        }

        if (Kata.isPrime(number)) {
            System.out.println("True:" + number + " is a prime number.");
        } else {
            System.out.println("False:" + number + " is not a prime number.");
        }
        
         int square = Kata.square(number);
         System.out.println("The square of " + number + " is:" + square);

         System.out.println("The factorial of " + number + " is:" + Kata.factorial(number));
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int input = scanner.nextInt();

        if(input < 0){
        System.out.println("Error: Factorial number is not defined for negative numbers:");
        }else{
        userChoice(input);
   }
      System.out.print("Enter the first number: ");
        int a = scanner.nextInt();

      System.out.print("Enter the second number: ");
        int b = scanner.nextInt();

     int difference = Kata.positiveDiff(a,b);
      System.out.println("The positive different between " + a + " and " + b + " is " + difference);
   
     
    }

}