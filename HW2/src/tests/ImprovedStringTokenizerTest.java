package tests;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;
import problem5.ImprovedStringTokenizer;

public class ImprovedStringTokenizerTest 
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
    public void returnWordsIntoArrayTest()
    {
        String phrase="This class is easy";
        ImprovedStringTokenizer strin=new ImprovedStringTokenizer(phrase," ");
        String words[]=strin.returnWordsIntoArray(phrase," ");
        assertEquals("This",words[0]);
        assertEquals("class",words[1]);
        assertEquals("is",words[2]);
        assertEquals("easy",words[3]);
    }

}
