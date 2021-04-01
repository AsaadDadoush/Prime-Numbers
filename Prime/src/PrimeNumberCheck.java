import java.util.*;

public class PrimeNumberCheck {

	public static String isPrime(int number) {
		
		if (number == 1)
			return "Non-Prime";
		
		for (int divisor = 2; divisor < number; divisor++) {
			boolean isNumberDivisibleByDivisor = (number
					% divisor == 0);
			if (isNumberDivisibleByDivisor)
				return "Non-Prime";
		}
		return "Prime";
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the number of intgers: ");
		int x = input.nextInt();
		long startTime = System.nanoTime(); 
		System.out.println(startTime);
		for(int i = 1; i <= x ; i++) {
			
			System.out.println(i + " is " + PrimeNumberCheck.isPrime(i));
			
		}
		long estimatedTime = System.nanoTime() - startTime;
		double TimeOnSec = (estimatedTime/Math.pow(10, 9));
		System.out.println(TimeOnSec);

	}

}