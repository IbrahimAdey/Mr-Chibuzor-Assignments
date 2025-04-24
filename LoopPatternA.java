public class LoopPatternA{
  public static void main(String[] args){

    for(int row = 1; row <= 10; row++){

    for(int column = 9; column >= row; column--){
     System.out.print(" "); }

    for(int rc = 1; rc <= row; rc++){
      System.out.print("*"); }
      System.out.println(); }

}



}