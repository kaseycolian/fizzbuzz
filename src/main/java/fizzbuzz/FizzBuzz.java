package fizzbuzz;

public class FizzBuzz {

	// public String say(int number) { // say is the method that brings the output
	// back; this is a public String because we're returning something.
	// if (isFizz(number) && number % 5 == 0) {
	// return "fizzbuzz";
	// }
	// if (isFizz(number)) {
	// return "fizz"; // return stops the execution, whereas printline won't halt
	// the execution.
	// // Return something from a method, you are returning that value back to where
	// it
	// // was called from. It will no longer execute any code in that method. You
	// done.
	// }
	// if (number % 5 == 0) {
	// return "buzz";
	// }
	//
	// return number + " gets you no fizzbuzz, sorry!";
	//
	// }

	public String loopTo100() { // has to be a public void, void because we're printing out and not returning
								// anything. If it doesn't have a return in it, it has to be a void.
		int fizzCount = 0;
		int buzzCount = 0;// Count starts at 0.
		for (int i = 0; i <= 100; i++) {
			if (isFizz(i) && i % 5 == 0) {
				System.out.println("fizzbuzz");
				fizzCount++;
				buzzCount++;
			} else if (isFizz(i)) {
				System.out.println("fizz"); // return stops the execution, whereas printline won't halt the execution.
				// Return something from a method, you are returning that value back to where it
				// was called from. It will no longer execute any code in that method. You done.
				fizzCount++;
			} else if (i % 5 == 0) {
				System.out.println("buzz");
				buzzCount++;
			} else {

				System.out.println(i + " gets you no fizzbuzz, sorry!");
			}
		}
		return "fizzCount: "+ fizzCount + " buzzCount: " + buzzCount;

	}

	private boolean isFizz(int n) {
		return n % 3 == 0;
	}
}