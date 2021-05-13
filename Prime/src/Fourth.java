import java.util.Scanner;

public class Fourth {
	public static void main (String[]args) {
		System.out.println("Please enter the number");
		Scanner input =new Scanner(System.in);
		
		int bn;
		double n=input.nextInt();
		long startTime = System.nanoTime(); 
		double vc=n;
		while(true)	 {
		if(vc==2) {
			System.out.println("the number"+vc+" is prime "); 
			break;
		}
		if(vc%2==0) {
		System.out.println("the number"+vc+" is not prime ");
		break;
		
		}
	double k=Math.sqrt(vc);
	Math.floor(k);	
	for(int i=0;i<k;i++) {
		if(k%2!=0) {
			if((vc%k)==0) {
				System.out.println("the number"+vc+" is not prime ");
				break;
				//continue;
				
			}
			if(vc%(k-(Math.pow(2, i)))==0&&k!=0) {
				System.out.println("the number"+vc+" is not prime ");
				bn=1;
				break;
			}				
		}
		if(k%2==0) {
			if(vc%(k-(Math.pow(2, i)-1))==0&&k!=0) {
				System.out.println("the number"+vc+" is not prime ");
				bn=1;
				break;
			}	
			
		}
		
}
	System.out.println("the number"+vc+" is  prime ");
	break;
		}
	
		long estimatedTime = System.nanoTime() - startTime;
		double TimeOnSec = (estimatedTime/Math.pow(10, 9));
		System.out.println("the time take it is :"+TimeOnSec);
	}
}

