package homeworkTest;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import homework.Thing;
import homework.Fly;

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
		Thing testThing = new Thing("blood");
		Fly testFly = new Fly("testFly");
		testFly.eat(testThing);
		assertEquals(testFly.eaten,true);
	}
	
	@Test
	public void testCantEat()
	{
		Thing testThing = new Thing("Tiger");
		Fly testFly = new Fly("testFly");
		testFly.eat(testThing);
		
		assertEquals(testFly.eaten,false);
	}
	
	@Test
	public void testWhatDidYouEat()
	{
		Fly testFly = new Fly("testFly");
		Thing testThing = new Thing("blood");
		testFly.eat(testThing);
		testFly.whatDidYouEat();
		assertEquals(testFly.ate,"blood");	
	}
}
