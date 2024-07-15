import java.util.Scanner;
public class MinimumMaximum{
public static void main(String[]args)  {

Scanner input = new Scanner (System.in);

System.out.print(" Enter ten integers: ");
int integer = input.nextInt();

int minimum = 0;
int maximum = 0;
int number = 0;

while(number <= 10) {

      if(number <   minimum) {
       minimum= number;
   }

   if(number > maximum) {
   maximum = number;
  }

  System.out.print(" Enter ten integers: ");
   number = input.nextInt();

  }

  System.out.println("Minimum is" + minimum);
  System.out.println("Maxixum is " + maximum);

      }

   }





