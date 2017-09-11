package homework;

import java.util.Scanner;

public class TestCreature extends Object
{
	public static final int CREATURE_COUNT = 6; //number of creatures to create
	public static final int THING_COUNT = 10; //number of things to create
	
	public TestCreature(){};
	
	public static void main(String args[])
	{
		Scanner scan = new Scanner(System.in);
		Thing[] things = new Thing[THING_COUNT];
		Creature[] creatures = new Creature[CREATURE_COUNT];
		int selection;
		String input, name;
		
		for (int i=0; i < THING_COUNT-4; i++)
		{
			System.out.print("Create a thing by entering a name for said thing: ");
			input = scan.nextLine();
			Thing thing = new Thing(input);
			things[i] = thing;
		}
		
		for (int j=6; j < THING_COUNT; j++)
		{
			System.out.print("Create a Tiger by entering a name for said tiger: ");
			name = scan.nextLine();
			Tiger tigerThing = new Tiger(name);
			things[j] = tigerThing;
		}
		
		for (int n=0; n < CREATURE_COUNT; n++)
		{
			System.out.println("\nCreature Creation Menu.");
			System.out.println("==================================");
			System.out.println("Ant: 1\nBat: 2\nFly: 3\nTiger: 4");
			System.out.println("==================================");
			System.out.print("Select the type of creature you would like to create: ");
			selection = Integer.parseInt(scan.nextLine());
			
			System.out.print("\nGreat Choice! Now give the ");
			
			switch(selection)
			{
				case 1:
				{
					System.out.print("Ant a name!: ");
					name = scan.nextLine();
					Ant ant = new Ant(name);
					creatures[n] = ant;
				}
				break;
				
				case 2:
				{
					System.out.print("Bat a name!: ");
					name = scan.nextLine();
					Bat bat = new Bat(name);
					creatures[n] = bat;
				}
				break;
				
				case 3:
				{
					System.out.print("Fly a name!: ");
					name = scan.nextLine();
					Fly fly = new Fly(name);
					creatures[n] = fly;
				}
				break;
				
				case 4:
				{
					System.out.print("Tiger a name!: ");
					name = scan.nextLine();
					Tiger tiger = new Tiger(name);
					creatures[n] = tiger;
				}
				break;
			}
		}
		
		scan.close();
		
		System.out.println("\nThings:\n");
		for (int k=0; k < THING_COUNT; k++)
		{
			System.out.println(things[k].thingName);	
		}
		
		System.out.println("\nCreatures:\n");
		for(int b =0; b < CREATURE_COUNT; b++)
		{
			System.out.println(creatures[b].creatureName);
		}
	}
}
