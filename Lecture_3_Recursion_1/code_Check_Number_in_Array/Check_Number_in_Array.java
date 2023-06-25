package code_Check_Number_in_Array;

import java.util.Scanner;

public class Check_Number_in_Array 
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
	
	public static boolean checkNumberInArray(int []input, int x, int startIndex)
	{
		if(startIndex == input.length)
		{
			return false;
		}
		
		if(input[startIndex] == x)
		{
			return true;
		}
		return checkNumberInArray(input, x ,startIndex+1);	
	}

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int arr[] = takeInput();
		int x = sc.nextInt();
		boolean ans = checkNumberInArray(arr,x,0);
		System.out.println(ans);

	}

}
