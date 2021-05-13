import java.util.Scanner;

public class Prime_Number {
	public static void main (String[]args) {
		System.out.println("Please enter the number");
		Scanner input =new Scanner(System.in);
		
		double n=input.nextInt();
		long startTime = System.nanoTime(); 
		for(int v=0;v<20*n;v++) {
		double vc=n--;
		
		if(vc==2) {
			System.out.println("the number"+vc+" is prime "); 
			continue;
		}
		if(vc%2==0) {
		System.out.println("the number"+vc+" is not prime ");
		continue;
		}
	double k=Math.sqrt(vc);
	Math.floor(k);	
	for(int i=0;i<k;i++) {
		if(k%2!=0) {
			if((vc%k)==0) {
				System.out.println("the number"+vc+" is not prime ");
				continue;
				//continue;
				
			}
			if(vc%(k-(Math.pow(2, i)))==0&&k!=0) {
				System.out.println("the number"+vc+" is not prime ");
				break;
			}				
		}
		if(k%2==0) {
			if(vc%(k-(Math.pow(2, i)-1))==0&&k!=0) {
				System.out.println("the number"+vc+" is not prime ");
				break;
			}	
			
		}
		
}
	System.out.println("the number " +vc+ " is  prime ");
	continue;
		
		
		}
		long estimatedTime = System.nanoTime() - startTime;
		double TimeOnSec = (estimatedTime/Math.pow(10, 9));
		System.out.println("the time take it is :"+TimeOnSec);
	}
}
