import java.util.Scanner;
public class RaisedToPower {
public static void main(String[]args){

   Scanner input = new Scanner(System.in);
	
	int count;


	System.out.print("Enter the value of base:");
	int base = input.nextInt();
	int holder = base; 
	System.out.print("Enter the value of power:");
        int power = input.nextInt();
	
	for (count = 1; count < power; count++) {
		holder*= base;
	
	


	}

	System.out.printf("%d%n", holder);



 }



  }