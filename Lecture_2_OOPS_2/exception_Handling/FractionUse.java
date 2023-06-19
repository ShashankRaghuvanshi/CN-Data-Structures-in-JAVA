package exception_Handling;


public class FractionUse 
{
	public static void main(String []args) //throws ZeroDenominatorException
	{
		Fraction f1 = new Fraction(20,30);
		f1.print();
		
		f1.setNumerator(12);
		int d = f1.getDenominator();
		System.out.println(d);
		f1.print();
		
		f1.setNumerator(10);
//		f1.setDenominator(0);
		int i =47;
		//handling Exception
		try
		{
			i++;
			f1.setDenominator(0);         //after this does not run other statements
			i++;						  //it will run only in case of no exception
		}
		catch(ZeroDenominatorException e)
		{
			System.out.println("Hey don't input 0 as denominator");      //run only if there is an exception
		}
		finally
		{
//			put common code try and catch in finally block and it must run .
		}
		System.out.println(i);
		
		f1.print();
		
		Fraction f2 = new Fraction(3,4);
		f1.add(f2);
		f1.print();
		f2.print();
		
		Fraction f3 = new Fraction(4,5);
		f3.multiply(f2);
		f3.print();
		f2.print();
		
		Fraction f4 = Fraction.add(f1,f3);
		f1.print();
		f3.print();
		f4.print();
		
	}
}
