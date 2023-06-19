package inheritance_and_private_members;

public class Car extends Vehicle
{
	int numGears;
	boolean isConvertible;
	
	public void printCar()
	{
		System.out.println("Car color: "+ color);
		System.out.println("Car Speed: "+ getMaxSpeed());
		System.out.println("Car number Gears: "+ numGears);
		System.out.println("Car Convertible: "+ isConvertible);
	}
}
