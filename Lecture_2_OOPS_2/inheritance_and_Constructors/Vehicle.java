package inheritance_and_Constructors;

public class Vehicle 
{
	protected String color;
	private int maxSpeed;

	public Vehicle(int maxSpeed)
	{
		this.maxSpeed = maxSpeed;
		System.out.println("vehicle constructor");
	}
	
	public int getMaxSpeed() 
	{
		return maxSpeed;
	}

	public void setMaxSpeed(int maxSpeed) 
	{
		this.maxSpeed = maxSpeed;
	}

	public void print()
	{
		System.out.println("Vehicle Color: "+ color);
		System.out.println("Vehicle Speed: "+ getMaxSpeed());
	}
}
