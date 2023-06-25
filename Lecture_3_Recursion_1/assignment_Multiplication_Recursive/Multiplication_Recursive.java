package assignment_Multiplication_Recursive;

import java.util.Scanner;

public class Multiplication_Recursive 
{
	public static int multiplication(int m, int n)
	{
		return m * n;
	}
	
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int m = sc.nextInt();
		int n = sc.nextInt();
		
		int result = multiplication(m,n);
		System.out.println(result);
	}

}
