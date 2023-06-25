package fibonacci_Number;

import java.util.Scanner;

public class Fibonacci_Number 
{
	public static int fabonacciNumber(int n)
	{
		if(n<2)
		{
			return n;
		}
		return fabonacciNumber(n-1) + fabonacciNumber(n-2);
	}

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int ans = fabonacciNumber(n);
		System.out.println(ans);

	}

}
