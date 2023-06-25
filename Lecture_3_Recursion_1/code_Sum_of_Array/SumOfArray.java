package code_Sum_of_Array;

import java.util.Scanner;

public class SumOfArray 
{
	public static int[] takeInput()
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int []input = new int[n];
		for(int i=0; i<n; i++)
		{
			input[i] = sc.nextInt();
		}
		return input;
	}
	
	public static int sumOfArray(int []input, int startIndex)
	{
		if(startIndex == input.length)
		{
			return 0;
		}
		return input[startIndex] + sumOfArray(input, startIndex+1);
		
	}

	public static void main(String[] args) 
	{
		int arr[] = takeInput();
		int ans = sumOfArray(arr,0);
		System.out.println(ans);

	}

}
