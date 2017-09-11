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
		String creature =  aThing.toString();

		if (creature.equals("Creature") || creature.equals("Tiger") || creature.equals("Bat") || creature.equals("Ant") ||creature.equals("Fly"))
		{
			System.out.println(batName + " has just eaten a(n) " + aThing.thingName);
			eaten = true;
			ate = aThing.thingName;
		}
		else if(creature.equals("Thing"))
		{
			System.out.println(batName + " won't eat a(n) " + aThing.thingName);
			eaten = false;
		}
		else
		{
			System.out.println("...");
			eaten = false;
		}
	}
	
	public void move()
	{
		fly();
	}
	
	public void fly()
	{
		System.out.println(batName + " " + getClass().getSimpleName() + " is swooping through the dark.");
	}
}
