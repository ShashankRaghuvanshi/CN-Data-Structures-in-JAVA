package introduction_To_Recursion;

public class Factorial 
{
	public static int fact(int n)
	{
		//base case
		if(n == 0)
		{
			return 1;
		}
		
		int smallAns = fact(n - 1);              //every function call is seperate to other function, each function variable is different and take seperate value 
		return n * smallAns;
	}

	public static void main(String[] args) 
	{
		int n = 3;
		int ans = fact(n);
		System.out.println(ans);

	}

}
