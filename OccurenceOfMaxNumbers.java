import java.util.Scanner;

   public class OccurenceOfMaxNumbers{
     public static void main(String[] args){

   Scanner scanner = new Scanner(System.in);

      int number;
      int largest = Integer.Maxvalue;
      int count = 0;
     
       System.out.println("Enter numbers (end with 0);");

     if(number > largest) {
       largest = number;
        count = 1;

     }else if(number == largest) {
        count++;
   }
     
       if(largest == Integer.Maxvalue) {
        System.out.println("No numbers were entered");

      }else{
        System.out.println("The largest number is" + largest);
        System.out.println("It occured" + count + "times.");
    }
 
}
}
