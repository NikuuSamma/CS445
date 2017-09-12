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
		String creature =  aThing.getClass().getSimpleName();

		if (creature.equals("Tiger") || creature.equals("Fly") || creature.equals("Bat") || creature.equals("Ant"))
		{
			System.out.println(batName.toString() + " has just eaten a(n) " + aThing.toString());
			eaten = true;
			ate = aThing.toString();
		}
		else if(creature.equals("Thing"))
		{
			System.out.println(batName.toString() + " won't eat a(n) " + aThing.toString());
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
		System.out.println(batName.toString() + " " + getClass().getSimpleName() + " is swooping through the dark.");
	}
}
