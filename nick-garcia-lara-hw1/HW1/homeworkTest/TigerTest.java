package homeworkTest;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import homework.Tiger;
import homework.Thing;

public class TigerTest 
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
		Tiger testTiger = new Tiger("testTiger");
		testTiger.move();;
		assertEquals(testTiger.toString() + " has just pounced.\n",println.toString());
	}
	
	@Test
	public void testEat()
	{
		Thing[] testThings = new Thing[1];
		Tiger testTiger = new Tiger("testTiger");
		Thing testThing = new Thing("meat");
		testThings[0] = testThing;
		testTiger.eat(testThings[0]);
		assertEquals(testTiger.eaten,true);
	}
	
	@Test
	public void testWhatDidYouEat()
	{
		Thing[] testThings = new Thing[1];
		Tiger testTiger = new Tiger("testTiger");
		Thing testThing = new Thing("meat");
		testThings[0] = testThing;
		testTiger.eat(testThings[0]);
		testTiger.whatDidYouEat();
		assertEquals(testTiger.ate,"meat");
	}
	
	@Test
	public void testWhatDidYouEatNothing()
	{
		Thing[] testThings = new Thing[1];
		Tiger testTiger = new Tiger("testTiger");
		Thing testThing = new Thing("meat");
		testThings[0] = testThing;
		testTiger.move();
		assertEquals(testTiger.ate,null);
	}
}


