import java.util.Array;

public class UniqueNumbers{
   public static void main(String[] args){

  int[] numbers = {1, 2, 3, 2};
  List<Integer> uniqueNumbers = new ArrayList<>();

    for (int number : numbers){
       if(!uniqueNumbers.contains(number)){
           uniqueNumbers.add(number);


}

  }

     System.out.println("Unique numbers: " + uniqueNumbers );


 }

}