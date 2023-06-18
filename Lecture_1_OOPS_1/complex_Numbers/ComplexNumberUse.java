package complex_Numbers;

public class ComplexNumberUse 
{
	public static void main(String[] args) 
	{
		ComplexNumber c1 = new ComplexNumber(3,4);
		c1.print();
		
		c1.setReal(5);
		c1.setImaginary(7);
		
		System.out.println(c1.getReal());
		System.out.println(c1.getImaginary());
		c1.print();
		
		ComplexNumber c2 = new ComplexNumber(9,11);
		c2.print();
		
		c1.add(c2);
		c1.print();
		c2.print();
		
		c1.multiply(c2);
		c1.print();
		c2.print();
		
		c1.conjugate();
		c1.print();
		
		ComplexNumber c3 = ComplexNumber.add(c1,c2);
		c3.print();
		c2.print();
		c1.print();
		
		
	}

}
