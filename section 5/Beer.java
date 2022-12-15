public class Beer {
   public static void main(String[] args) {
      for (int i = 99; i >= 1; i--) {
         sing(i);
      }
   }

   /**
    * Task 1
    * Function name – sing.
    *
    * @param i (int)
    *
    *
    *          Inside the function:
    *          1. print:
    *          <i> bottles of beer on the wall, <i> bottles of beer!
    *          take one down, pass it around, <i-1> bottles of beer on the wall!
    */
   public static void sing(int number) {
      System.out.println(number + " bottles of beer on the wall, " + number
            + " bottles of beer! take one down, pass it around, " + (number - 1) + " bottles of beer on the wall!");
   }
}
