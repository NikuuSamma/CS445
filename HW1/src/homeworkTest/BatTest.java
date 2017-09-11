package homeworkTest;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import homework.Bat;
import homework.Thing;

public class BatTest {

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
		Bat testBat = new Bat("testBat");
		testBat.move();
		assertEquals(testBat.toString() + " is swooping through the dark.\n",println.toString());
	}
	
	@Test
	public void testFly() 
	{
		Bat testBat = new Bat("testBat");
		testBat.fly();
		assertEquals(testBat.toString() + " is swooping through the dark.\n",println.toString());
	}
	
	@Test
	public void testEat()
	{
		Thing testThing = new Thing("Tiger");
		Bat testBat = new Bat("testBat");
		testBat.eat(testThing);
		assertEquals(testBat.eaten,true);
	}
	
	@Test
	public void testCantEat()
	{
		Thing testThing = new Thing("blood");
		Bat testBat = new Bat("testBat");
		testBat.eat(testThing);
		assertEquals(testBat.eaten,false);
	}
	
	@Test
	public void testWhatDidYouEat()
	{
		Bat testBat = new Bat("testBat");
		Thing testThing = new Thing("Tiger");
		testBat.eat(testThing);
		testBat.whatDidYouEat();
		assertEquals(testBat.ate,"Tiger");	
	}
}
