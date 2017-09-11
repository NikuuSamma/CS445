package homework;

public class Bat extends Creature implements Flyer
{
	public String batName;

	public Bat()
	{
		super();
		this.batName = "Bat"; 
	}
	
	public Bat(String name)
	{
		super(name);
		this.batName = name;
	}
	
	public void eat(Thing aThing)
	{
		
	}
	
	public void move()
	{
		fly();
	}
	
	public void fly()
	{
		System.out.println(batName + " is swooping through the dark.");
	}
}
