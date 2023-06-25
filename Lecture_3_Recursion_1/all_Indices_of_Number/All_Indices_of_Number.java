package all_Indices_of_Number;

import java.util.Scanner;

public class All_Indices_of_Number 
{
	public static int[] takeInput()
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int input[] = new int[n];
		for(int i=0; i<n; i++)
		{
			input[i] = sc.nextInt();
		}
		return input;
	}
	
	public static void allIndex(int input[], int x, int startIndex)
	{
		if(startIndex == input.length)
		{
			return;
		}
		if(input[startIndex] == x)
		{
			System.out.print(startIndex+" ");
		}
		allIndex( input, x, startIndex + 1);
	}
	
	public static void allIndex(int input[])
	{
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		allIndex( input, x, 0);
	}
	
	public static void main(String[] args) 
	{
		int arr[] = takeInput();
		allIndex(arr);

	}

}
