package vehicle_inheritence;

public class VehicleUse 
{

	public static void main(String[] args) 
	{
		Vehicle v = new Vehicle();
		v.print();
		
		Car c = new Car();
		c.numGears = 10;
		c.color = "Black";
		c.maxSpeed = 100;
		c.print();
		

	}

}
