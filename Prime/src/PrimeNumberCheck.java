import java.util.*;

public class PrimeNumberCheck {

	public static String isPrime(int n) {
		
		
		if (n == 1)
			return "Non-Prime";
		
		for (int div = 2; div < n; div++) {
			boolean isNDivByDivisor = (n	% div == 0);
			if (isNDivByDivisor)
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
		double TimeOnSec = (estimatedTime/Math.pow(10.0, 9.0));
		System.out.println("estimated time : " + TimeOnSec);

	}

}