public class BitwiseCalc {
    public static void main(String[] args) {
        // write your code here
        System.out.println("Task 4 $ 5");

       BitwiseCalc abc = new BitwiseCalc();
       BitwiseCalc def = new BitwiseCalc();

       String binaryLeft = "0";
       String binaryRight = "1";
       String binary = "1";

       System.out.println("The 'end' function with strings 0 and 1 has the value: " + and(binaryLeft, binaryRight));

       System.out.println("The 'or' function with strings 0 and 1 has the value: " + or(binaryLeft, binaryRight));

       System.out.println("The 'xor' function with strings 0 and 1 has the value: " + xor(binaryLeft, binaryRight));

       System.out.println("The 'not' function with strings 0 has the value: " + not(binary));

   }

   public static boolean and(String binaryLeft, String binaryRight) {
       int i = Integer.parseInt(String.valueOf(binaryLeft));
       // System.out.println(i);
       if (binaryLeft.equals(binaryRight) & i == 1)
           return true;
       return false;
   }

   public static boolean or(String binaryLeft, String binaryRight) {
       int i = Integer.parseInt(String.valueOf(binaryLeft));
       int j = Integer.parseInt(String.valueOf(binaryRight));
       if (i == 1 | j == 1)
           return true;
       return false;
   }

   public static boolean xor(String binaryLeft, String binaryRight) {
       int i = Integer.parseInt(String.valueOf(binaryLeft));
       int j = Integer.parseInt(String.valueOf(binaryRight));
       if (i == 1 ^ j == 1)
           return true;
       return false;
   }

   public static boolean not(String binary) {
       int i = Integer.parseInt(String.valueOf(binary));
       if (i != 1)
           return true;
       return false;
   }

}
