   /* CS 1302
    * SECTION
    * PROFESSOR NORTH
    * GORDON ELLIOTT WILLIAMS
    * Assignment 9 - Chapter 18 - Program 1
   */
 
import java.util.Scanner;

public class Assignment9Chapter18Program1 {

   static int firstarray[]=new int[10];
   static int min=9999999;

private static void minValue(int[] secondarray,int y) {

   if(y==secondarray.length)

   {
      return;
   }

   else

   {
   if(min>secondarray[y])

        min=secondarray[y];

        minValue(secondarray, y + 1);

   }

   }

public static void main(String[] args) {

   Scanner input = new Scanner(System.in);

   for(int y = 0; y < 10; y++)

   {

   System.out.println("Please input "+ (y + 1 )+ "th number/element into my array");
   firstarray[y]=input.nextInt();

   }

   minValue(firstarray,0);
   System.out.println("The smallest number from this array of ten numbers is: " + min);

   }

}