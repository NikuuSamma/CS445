package homeworkTest;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import homework.Ant;
import homework.Thing;

public class AntTest 
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
		Ant testAnt = new Ant("testAnt");
		testAnt.move();
		assertEquals(testAnt.toString() + " is crawling around.\n",println.toString());
	}
	
	@Test
	public void testEat()
	{
		Ant testAnt = new Ant("testAnt");
		Thing[] testThings = new Thing[1];
		Thing testThing = new Thing("sugar");
		testThings[0] = testThing;
		testAnt.eat(testThings[0]);
		assertEquals(testAnt.eaten,true);
	}
	
	@Test
	public void testWhatDidYouEat()
	{
		Ant testAnt = new Ant("testAnt");
		Thing[] testThings = new Thing[1];
		Thing testThing = new Thing("sugar");
		testThings[0] = testThing;
		testAnt.eat(testThings[0]);
		testAnt.whatDidYouEat();
		assertEquals(testAnt.ate,"sugar");
	}
	
	@Test
	public void testWhatDidYouEatNothing()
	{
		Ant testAnt = new Ant("testAnt");
		Thing[] testThings = new Thing[1];
		Thing testThing = new Thing("sugar");
		testThings[0] = testThing;
		testAnt.move();
		testAnt.whatDidYouEat();
		assertEquals(testAnt.ate,null);
	}
}
