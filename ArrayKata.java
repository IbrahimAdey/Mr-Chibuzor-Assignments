public class ArrayKata {

    public static int findMax(int[] array) {
        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        return max;
    }

    public static int findMin(int[] array) {
        int min = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        return min;
    }
     public static int findSum(int[] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
                sum += array[i];
      }
        return sum;
      }
   
     
}