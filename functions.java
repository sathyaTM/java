package Prelims;

public class functions {

	public static void main(String[] args)
	{
		int s=sumFunction(100,200,300);
		if (s>100)
		System.out.println("Greater than 100");
		else
			System.out.println("Less than 100");
		int input=100;
		int t=calcFunction(input);
		System.out.println("Sum of "+input+" numbers ="+t);
		input=200;
		t=calcFunction(input);
		System.out.println("Sum of "+input+" numbers ="+t);
	}
	
//sumFunction
	public static int sumFunction(int a, int b, int c)
	{
		int sum=a+b+c;
		return sum;
	}
	
//calcFunction
	public static int calcFunction(int n)
	{
		int sum=0;
		for(int x=0;x<=n;x++)
		{
			sum=sum+x;
		}
		return sum;
	}
}
