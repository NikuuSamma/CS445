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
		Thing testThing = new Thing("sugar");
		Ant testAnt = new Ant("testAnt");
		testAnt.eat(testThing);
		assertEquals(testAnt.eaten,true);
		
	}
	
	@Test
	public void testWhatDidYouEat()
	{
		Ant testAnt = new Ant("testAnt");
		Thing testThing = new Thing("sugar");
		testAnt.eat(testThing);
		testAnt.whatDidYouEat();
		assertEquals(testAnt.ate,"sugar");
		
	}
}
