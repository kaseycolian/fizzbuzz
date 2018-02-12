package fizzbuzz;



import org.junit.Assert;
import org.junit.Test;

public class FizzBuzzTest {

	//multiples of 3 = fizz
	//multiples of 5 = buzz
	//multiples of 15 = fizzbuzz
	@Test
	public void shouldSayOne() {
		//arrange
		FizzBuzz underTest = new FizzBuzz();
		//act
		String response = underTest.say(1);
		
		//assert
		Assert.assertEquals(1);
		
		
	}
	@Test
	public void shouldSayTwo() {
		FizzBuzz underTest = new FizzBuzz();
		
		String response = underTest.say(2);
		
		Assert.assertEquals("2 gets you no fizzbuzz, sorry!", response);
	}
		@Test
		public void shouldSayFizz() {
			FizzBuzz underTest = new FizzBuzz();
			String response = underTest.say(3);
			Assert.assertEquals("fizz", response);
	}
	
		@Test 
		public void shouldSayBuzz() {
			FizzBuzz underTest = new FizzBuzz();
			String response = underTest.say(5);
		
			Assert.assertEquals("buzz", response);
		}
		@Test
		public void shouldSayFizzForSix() {
		FizzBuzz underTest = new FizzBuzz();
		String response = underTest.say(5);
	
		Assert.assertEquals("buzz", response);
}
		@Test
		public void shouldSayFizzForTen() {
		FizzBuzz underTest = new FizzBuzz();
		String response = underTest.say(10);
	
		Assert.assertEquals("buzz", response);
}
@Test
public void shouldSayFizzForFifteen() {
	FizzBuzz underTest = new FizzBuzz ();
	String response = underTest.say(15);
	Assert.assertEquals("fizzbuzz", response);
}

}
