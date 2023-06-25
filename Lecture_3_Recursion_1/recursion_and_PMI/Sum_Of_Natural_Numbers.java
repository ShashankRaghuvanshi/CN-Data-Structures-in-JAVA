package recursion_and_PMI;

public class Sum_Of_Natural_Numbers 
{
	public static int sum(int n)
	{
		if(n == 1)
		{
			return 1;
		}
		
		return sum(n-1) + n;
	}

	public static void main(String[] args) 
	{
		int ans = sum(10);
		System.out.println(ans);

	}

}

//base case
//smaller problem
//return case