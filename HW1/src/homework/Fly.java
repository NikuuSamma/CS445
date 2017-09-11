package homework;

public class Fly extends Creature implements Flyer
{
	public String flyName;

	public Fly()
	{
		super();
		this.flyName = "Fly"; 
	}
	
	public Fly(String name)
	{
		super(name);
		this.flyName = name;
	}
	
	public void eat(Thing aThing)
	{
		String creature =  aThing.toString();

		if (creature.equals("Creature") || creature.equals("Tiger") || creature.equals("Bat") || creature.equals("Ant") || creature.equals("Fly"))
		{
			System.out.println(flyName + " won't eat a(n) " + aThing.thingName);
			eaten = false;
		}
		else
		{
			System.out.println(flyName + " has just eaten a(n) " + aThing.thingName);
			eaten = true;
			ate = aThing.thingName;
		}
	}
	
	public void move()
	{
		fly();
	}
	
	public void fly()
	{
		System.out.println(flyName + " " + getClass().getSimpleName() + " is buzzing around in flight.");
	}
}
