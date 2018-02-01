package fizzbuzz;

import java.util.Scanner;

public class FizzBuzzApp {

	public static void main(String[] args) {
		
	Scanner input = new Scanner(System.in);

//	System.out.println("Please enter a number.");
//	int numberGiven = input.nextInt();
	
	FizzBuzz underTest = new FizzBuzz(); //defining new instance of fizzbuzz class
	String fizzAndBuzzCount = underTest.loopTo100(); //YOU MADE THIS UNDERTEST.LOOPTO100 METHOD TO DO THE COUNTING, DISPLAYING & COUNTING OF AMOUNTS 
				  									//= ALL YOU HAVE TO DO IS CALL THIS METHOD INTO THE APP!!!!!
	

	
	System.out.println(fizzAndBuzzCount);
System.out.println("Done counting!");
	}
	
	
	
//	String response = underTest.say(numberGiven); //say is the method that calls the output back
//
//	
//	if (numberGiven%3==0 && numberGiven%5==0) {
//		System.out.println("fizzbuzz");
//	}
//	else if (numberGiven%3==0) {
//		System.out.println("fizz"); 
//	}
//	else if (numberGiven %5==0) {
//		System.out.println("buzz");
//	}
//	else {System.out.println(numberGiven + " does not get you any fizzbuzz, sorry!");
//}
//	System.out.println(response);
//System.out.println(response + "\nThanks for playing!");
	

}
