import java.util.Scanner;

     public class True{
     public static void main(String[] args){

    Scanner scanner = new Scanner(System.in);

   System.out.print("Enter the first integer");
    int a = scanner.nextInt();

   System.out.print("Enter the second integer");
    int b = scanner.nextInt();

   System.out.print("Enter the third integer");
    int c = scanner.nextInt();

    if((b > a) && (c > b)){
    System.out.println("resut: True");

     }else{
      System.out.println("result: false");

}
 

}
}