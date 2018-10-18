package my;

public class MyMath
{
	public int getMax(int[] data)
	{
		int max=0;
		for(int i=0;i<data.length;i++)
		{
			if(max < data[i])
			{
				max = data[i];
			}
		}
		return max;
	}
	
	public boolean isPrime( int n )
	{
		for(int i=2; i<Math.sqrt(n); i++)
		{
			if( n % i == 0)
			{
				return false;
			}
		}
		return true;
	}
	
	public void showPrimes(int m, int n)
	{
		for(int i=m; i<=n ;i++)
		{
			if( this.isPrime(i))
			{
				System.out.println(i+"是质数");
			}
		}
	}
}
