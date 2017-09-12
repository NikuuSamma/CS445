package homeworkTest;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import homework.*;

public class FlyTest 
{
	private ByteArrayOutputStream println = new ByteArrayOutputStream();
	private PrintStream oldSystemOut = System.out;
	
	@Before
	public void setUpStreams()
	{
	    // capture System.out.println
	    System.setOut(new PrintStream(println));
	}

	@After
	public void cleanUpStreams()
	{
	    System.setOut(oldSystemOut);
	}
	
	@Test
	public void testMove() 
	{
		Fly testFly = new Fly("testFly");
		testFly.move();
		assertEquals(testFly.toString() + " is buzzing around in flight.\n",println.toString());
	}
	
	@Test
	public void testFly() 
	{
		Fly testFly = new Fly("testFly");
		testFly.fly();
		assertEquals(testFly.toString() + " is buzzing around in flight.\n",println.toString());
	}
	
	@Test
	public void testEat()
	{
		Thing[] testThings = new Thing[1];
		Thing testThing = new Thing("Blood");
		testThings[0] = testThing;
		Fly testFly = new Fly("testFly");
		testFly.eat(testThing);
		assertEquals(testFly.eaten,true);
	}
	
	@Test
	public void testWontEat()
	{
		Tiger testTiger = new Tiger("Growler");
		Bat testBat = new Bat("Zubat");
		Ant testAnt = new Ant("Bugs");
		Fly testFly = new Fly("Pest");
	
		Creature[] creatures = new Creature[4];
		
		Thing[] things = new Thing[4];
		for (int i=0; i < 4; i++)
		{
			switch (i)
			{
				case 0:
				{
					creatures[i] = testTiger;
					things[i] = creatures[i];
				}
				break;
				
				case 1:
				{
					creatures[i] = testBat;
					things[i] = creatures[i];
				}
				break;
				
				case 2:
				{
					creatures[i] = testAnt;
					things[i] = creatures[i];
				}
				break;
				
				case 3:
				{
					creatures[i] = testFly;
					things[i] = creatures[i];
				}
				break;
			}
		}
		
		Fly testFly2 = new Fly("testFly");
		
		for(int j = 0; j < 4; j++)
		{
			testFly2.eat(things[j]);
			assertEquals(testFly2.eaten,false);
		}
	}
	
	@Test
	public void testWhatDidYouEat()
	{
		Tiger testTiger = new Tiger("Henry");
		Thing testThing = new Thing("blood");
		Thing[] things = new Thing[2];
		things[0] = testTiger;
		things[1] = testThing;
		Fly testFly = new Fly("testFly");
		testFly.eat(things[1]);
		testFly.whatDidYouEat();
		assertEquals(testFly.ate,testThing.toString());	
	}
	
	@Test
	public void testWhatDidYouEatNothing()
	{
		Thing[] testThings = new Thing[1];
		Fly testFly = new Fly("testFly");
		Thing testThing = new Thing("blood");
		testThings[0] = testThing;
		testFly.move();
		testFly.whatDidYouEat();
		assertEquals(testFly.ate,null);
	}
}
