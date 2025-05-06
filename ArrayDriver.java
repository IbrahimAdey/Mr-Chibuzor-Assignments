public class ArrayDriver {

    public static void main(String[] args) {

       int[] numbers = {11, 7, 12, 9, 6, 10, 3};
        
        int maximum = ArrayKata.findMax(numbers);
        int minimum = ArrayKata.findMin(numbers);
        int sum = ArrayKata.findSum(numbers);
       // int sumOfEven = ArrayKata.findSumOfEven(numbers);

        System.out.println("The maximum value in the array is: " + maximum);
        System.out.println("The minimum value in the array is: " + minimum);
        System.out.println("The sum of the elements in array is: " + minimum);
        System.out.println("The maximum and minimum value in the array is: " + maximum + " and " + minimum);
       // System.out.println("The sum of the even in array is: " + sumOfEven);
    }
}











