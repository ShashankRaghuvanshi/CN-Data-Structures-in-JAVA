package inheritance_and_private_members;

public class VehicleUse 
{
	public static void main(String[] args) 
	{	
		Vehicle v = new Vehicle();
		v.setMaxSpeed(10);
		v.color = "green";
		v.print();
		
		Car c = new Car();
		c.numGears = 10;
		c.isConvertible = true;
		c.color = "blue";
		c.setMaxSpeed(100);
//		c.maxSpeed = 100;
		c.printCar();
		

	}
}
