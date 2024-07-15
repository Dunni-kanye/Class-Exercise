import java.util.Scanner;

public class SumOfEvenNumbers {
	public static void main(String[]args) {
	Scanner input = new Scanner(System.in);


        int number = 0;
	int even = 0;
	int odd = 0;
	
	


	       for(number = 1; number <= 10; number++) {

		sumOfEven += number;
		sumOfOdd += number;

		System.out.print("Enter ten scores:");
	 	number = input.nextInt();

	if (number %2 == 0 ) {
	System.out.println("sumOfEven is" + number );
	} 
	else {
	System.out.println("sumOfOdd is" + number );

	}
	


	
	

    }

  } 
}


	
	