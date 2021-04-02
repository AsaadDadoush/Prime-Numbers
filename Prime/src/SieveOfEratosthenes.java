class SieveOfEratosthenes {
	void sieveOfEratosthenes(int n)
	{
		boolean prime[] = new boolean[n + 1];
		for (int i = 0; i <= n; i++)
			prime[i] = true;

		for (int p = 2; p * p <= n; p++)
		{
			if (prime[p] == true)
			{
				for (int i = p * p; i <= n; i += p)
					prime[i] = false;
			}
		}
		for (int i = 2; i <= n; i++)
		{
			if (prime[i] == true)
				System.out.println(i + " ");
		}
	}
	public static void main(String args[])
	{
		long startTime = System.nanoTime(); 
		int n = 1000000;
		System.out.print("Following are the prime numbers ");
		System.out.println("smaller than or equal to " + n);
		SieveOfEratosthenes g = new SieveOfEratosthenes();
		g.sieveOfEratosthenes(n);
		long estimatedTime = System.nanoTime() - startTime;
		double TimeOnSec = (estimatedTime/Math.pow(10, 9));
		System.out.println("estimated time: " + TimeOnSec);
	}
}