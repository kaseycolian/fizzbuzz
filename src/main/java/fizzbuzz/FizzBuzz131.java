package fizzbuzz;

public class FizzBuzz131 {

	

	public String getResult(int i) {
//	for (int i< )
	
	do {
		if (i % 15 == 0)
			return "fizzbuzz";
		else if (i % 5 == 0)
			return "buzz";
		else if (i % 3 == 0)
			return "fizz";
		else
			return Integer.toString(i);
	}while (i<=100);


	
	}	
}
