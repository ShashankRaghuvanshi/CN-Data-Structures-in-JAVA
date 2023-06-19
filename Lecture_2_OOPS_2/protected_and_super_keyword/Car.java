package protected_and_super_keyword;

public class Car extends Vehicle
{
	int numGears;
	boolean isConvertible;
	
	int maxSpeed = 100;
	
	public void print()
	{
		super.print();                                      //super
		System.out.println("Car number Gears: "+ numGears);
		System.out.println("Car Convertible: "+ isConvertible);
	}
	
	public void  printMaxSpeed()
	{
		super.setMaxSpeed(150);
		System.out.println("vehicle " +super.getMaxSpeed());
		System.out.println("car "+ maxSpeed);
	}
}
