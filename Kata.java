public class Kata{
  public static boolean isEven(int number){
    return number%2 == 0;

}
  public static boolean isPrime(int number){
     if(number <= 1){
     return false;
}
   for(int i = 2; i <= Math.sqrt(number); i++){
     if(number % i == 0){
     return false;
}
  }
    return true;
   }

   public static int positiveDiff(int a,int b){
      return Math.abs(a - b);
  
}

   public static int square(int number){
      return number * number;
}
  
   public static long factorial(int number){
     long result = 1;
     for(int i = 2; i <= number; i++){
      result *= i;
   }
     return result;
  } 

}