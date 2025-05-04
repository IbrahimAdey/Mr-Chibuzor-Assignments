public class Katakata {
   public static int findFifthMultiple(int number) {
    return number*5;
 }
    public static boolean isPrime(int number) {
        if (number <= 1) return false;
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) return false;
        }
        return true;
    }
    public static void first50PrimeNo() {
        int count = 0;
        int num = 2;
        System.out.println("First 50 prime numbers:");
        while (count < 50) {
            if (isPrime(num)) {
                System.out.print(num + " ");
                count++;
            }
            num++;
        }
        System.out.println();
    }
      
    public static int sumOfDigits(int number){
        int sum = 0;
        while(number > 0){
        sum += number % 10;
        number /= 10;
  }
      return sum;
 }

    public static boolean isLeapYear(int year){
      return(year % 4 == 0 && year % 100 != 0)||(year % 400 == 0);
   }
}