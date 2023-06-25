package assignment_Check_Palindrome_Recursive;

import java.util.Scanner;

public class Check_Palindrome 
{
	public static boolean checkPalindrome(String str,int startIndex,int endIndex)
	{
		if(str.length() == 1)
		{
			return true;
		}
		if(startIndex >= endIndex)
		{
			return true;
		}
		if(str.charAt(startIndex) != str.charAt(endIndex))
		{
			return false;
		}
		return checkPalindrome(str, startIndex+1, endIndex-1);
		
	}
	
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		boolean ans = checkPalindrome(str, 0, str.length()-1);
		System.out.println(ans);

	}

}
