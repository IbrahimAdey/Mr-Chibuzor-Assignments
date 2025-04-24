import java.util.Scanner;

    public class Game{
     public static void main(String[] args){
    
   Scanner scanner = new Scanner(System.in);
     int computer=0;
     int user=0;

     while(computer != 2 || user != 2){
     int computerGuess = (int)(Math.random() *3);
    

   System.out.print("Guess a number from 0 to 2: ");
      int myGuess = scanner.nextInt();

    if (myGuess == 0 && computerGuess == 1){
   System.out.print("The computer is scissors. You are rock. you won ");
	user = user + 1;}

    if (myGuess == 0 && computerGuess == 0){
   System.out.print("The computer is rock. You are rock. draw ");}

    if (myGuess == 0 && computerGuess == 2){
   System.out.print("The computer is paper. You are rock. you won ");
	user = user + 1;}

    if (myGuess == 1 && computerGuess == 1){
   System.out.print("The computer is scissors. You are scissors. draw ");}

   if (myGuess == 1 && computerGuess == 0){
   System.out.print("The computer is rock. You are scissors. you loss ");
      computer = computer + 1;}

   if (myGuess == 1 && computerGuess == 2){
   System.out.print("The computer is paper. You are scissors. you loss ");
       computer = computer + 1;}

    if (myGuess == 2 && computerGuess == 2){
   System.out.print("The computer is paper. You are paper. draw ");}

   if (myGuess == 2 && computerGuess == 1){
   System.out.print("The computer is scissors. You are paper. you loss");
      computer = computer + 1;}

   if (myGuess == 2 && computerGuess == 0){
   System.out.print("The computer is rock. You are paper. you won ");
      computer = computer + 1;
  

}




}
}