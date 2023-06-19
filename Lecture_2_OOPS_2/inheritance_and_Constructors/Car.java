package inheritance_and_Constructors;

public class Car extends Vehicle
{
	int numGears;
	boolean isConvertible;
	
	public Car(int numGears, int maxSpeed)
	{
		super(maxSpeed);
		this.numGears = numGears;
		System.out.println("car constructor");
	}
	
	public void print()
	{
		super.print();                                      
		System.out.println("Car number Gears: "+ numGears);
		System.out.println("Car Convertible: "+ isConvertible);
	}
	
}
