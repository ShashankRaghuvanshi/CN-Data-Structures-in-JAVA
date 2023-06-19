package polymorphism;

public class VehicleUse 
{
	public static void main(String[] args) 
	{	
		Vehicle v = new Car();
		v.color = "blue";
		v.print();               //polymorphism
	}
}
