import java.util.Scanner;

public class PrimFunder {

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int x, y, i, j, flag;

		System.out.printf("Enter lower value of the interval: ");
		x = sc.nextInt(); 

		System.out.printf("\nEnter upper bound of the interval: ");
		y = sc.nextInt(); 
		long startTime = System.nanoTime(); 

		System.out.printf("\nPrime numbers between %d and %d are: ", x, y);

		for (i = x; i <= y; i++) {

			if (i == 1 || i == 0)
				continue;

			flag = 1;

			for (j = 2; j <= i / 2; ++j) {
				if (i % j == 0) {
					flag = 0;
					break;
				}
			}
			if (flag == 1)
				System.out.println(i);
		}
		long estimatedTime = System.nanoTime() - startTime;
		double TimeOnSec = (estimatedTime/Math.pow(10, 9));
		System.out.println("estimated time: " + TimeOnSec);
	}
	
}
