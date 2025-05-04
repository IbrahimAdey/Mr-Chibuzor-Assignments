import java.util.Scanner;

     public class Driver {
       public static void main(String[] args) {

     Scanner scanner = new Scanner(System.in);

     System.out.println("Enter a number");
      int input = scanner.nextInt();

   int result = Katakata.findFifthMultiple(input);
 System.out.println("The fifth multiple is: " + result);


   Katakata.first50PrimeNo();

   System.out.print("Enter a 4-digit number to calculate the sum of its digits");
     int fourDigit = scanner.nextInt();

    if(fourDigit >= 1000 && fourDigit <= 9999){
     int sum = Katakata.sumOfDigits(fourDigit);
   System.out.println("The sum of the digits of " + fourDigit + " is " + sum);

    }else{
   System.out.println("Invalid of option, Enter a 4-digit number");
  }

   
   System.out.println("Enter a year to check if its a leap year");
     int year = scanner.nextInt();
     boolean isLeap = Katakata.isLeapYear(year);

    if(isLeap){
   System.out.println(year + " is a leap year.");
     
     }else{
   System.out.println(year + " is not a leap year.");
 }

}
}