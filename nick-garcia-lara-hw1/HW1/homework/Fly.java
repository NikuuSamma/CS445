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
		String creature =  aThing.getClass().getSimpleName();
		
		if (creature.equals("Tiger") || creature.equals("Fly") || creature.equals("Bat") || creature.equals("Ant"))
		{
			System.out.println(flyName.toString() + " won't eat a(n) " + aThing.toString());
			eaten = false;
		}
		else
		{
			System.out.println(flyName.toString() + " has just eaten a(n) " + aThing.toString());
			eaten = true;
			ate = aThing.toString();;
		}
	}
	
	public void move()
	{
		fly();
	}
	
	public void fly()
	{
		System.out.println(flyName.toString() + " " + getClass().getSimpleName() + " is buzzing around in flight.");
	}
}
