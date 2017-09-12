package homework;

import java.util.Scanner;
import java.util.Random;

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
		int selection, r;
		String input, name;
		
		for (int i=0; i < CREATURE_COUNT; i++)
		{
			System.out.println("Creature Creation Menu.");
			System.out.println("==================================");
			System.out.println("Ant: 1\nBat: 2\nFly: 3\nTiger: 4");
			System.out.println("==================================");
			System.out.print("Select the type of creature you would like to create: ");
			selection = Integer.parseInt(scan.nextLine());
			
			System.out.print("Great Choice! Now give the ");
			
			switch(selection)
			{
				case 1:
				{
					System.out.print("Ant a name!: ");
					name = scan.nextLine();
					Ant ant = new Ant(name);
					creatures[i] = ant;
					System.out.println("");
				}
				break;
				
				case 2:
				{
					System.out.print("Bat a name!: ");
					name = scan.nextLine();
					Bat bat = new Bat(name);
					creatures[i] = bat;
					System.out.println("");
				}
				break;
				
				case 3:
				{
					System.out.print("Fly a name!: ");
					name = scan.nextLine();
					Fly fly = new Fly(name);
					creatures[i] = fly;
					System.out.println("");
				}
				break;
				
				case 4:
				{
					System.out.print("Tiger a name!: ");
					name = scan.nextLine();
					Tiger tiger = new Tiger(name);
					creatures[i] = tiger;
					System.out.println("");
				}
				break;
			}
		}
		
		for (int j=0; j < THING_COUNT-6; j++)
		{
			System.out.print("Create a thing by entering a name for said thing: ");
			input = scan.nextLine();
			Thing thing = new Thing(input);
			things[j] = thing;
		}
		scan.close();
		
		for(int k=4; k<THING_COUNT; k++)
		{
			things[k] = creatures[k-4];
		}

		
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
		
		System.out.println("");
		Random rand = new Random();
		
		for(int q=0; q <CREATURE_COUNT; q++)
		{
			creatures[q].move();
			creatures[q].whatDidYouEat();
			r = rand.nextInt(10) + 0;
			creatures[q].eat(things[r]);
			creatures[q].whatDidYouEat();
			creatures[q].move();
			r = rand.nextInt(10) + 0;
			creatures[q].eat(things[r]);
			creatures[q].whatDidYouEat();
			System.out.println("");
		}
	}
}
