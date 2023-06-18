package complex_Numbers;

public class ComplexNumber 
{
	private int real;
	private int imaginary;
	
	public ComplexNumber(int real, int imaginary)
	{
		this.real = real;
		this.imaginary = imaginary;
	}

	public int getReal() 
	{
		return real;
	}

	public void setReal(int real) 
	{
		this.real = real;
	}

	public int getImaginary() 
	{
		return imaginary;
	}

	public void setImaginary(int imaginary) 
	{
		this.imaginary = imaginary;
	}
	
	public void print()
	{
		System.out.println(this.real+ " + " + this.imaginary + "i");
	}
	
	public void add(ComplexNumber c)
	{
		this.real = this.real + c.real;
		this.imaginary = this.real + c.imaginary;
	}
	
	public void multiply(ComplexNumber c)
	{
		int i = this.real * c.real - this.imaginary * c.imaginary;
		this.imaginary = this.real * c.imaginary + this.imaginary * c.real ;
		this.real = i;
	}
	
	public void conjugate()
	{
		this.real = this.real;
		this.imaginary = -this.imaginary;
	}
	
	public static ComplexNumber add(ComplexNumber c1, ComplexNumber c2)
	{
		int i = c1.real + c2.real;
		int j = c1.imaginary + c2.imaginary;
		ComplexNumber c = new ComplexNumber(i,j);
		return c;
	}
}
