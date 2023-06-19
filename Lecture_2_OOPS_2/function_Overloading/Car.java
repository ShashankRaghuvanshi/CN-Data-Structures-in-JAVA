package function_Overloading;

public class Car extends Vehicle
{
	int numGears;
	boolean isConvertible;
	
	public void print()
	{
		System.out.println("Car color: "+ color);
		System.out.println("Car Speed: "+ getMaxSpeed());
		System.out.println("Car number Gears: "+ numGears);
		System.out.println("Car Convertible: "+ isConvertible);
	}
}
