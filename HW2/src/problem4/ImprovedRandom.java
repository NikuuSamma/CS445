package problem4;

import java.util.Random;

public class ImprovedRandom extends Random 
{
	private static final long serialVersionUID = -7251950233433409912L;
	

	public ImprovedRandom()
	{
		super();
	}

	public ImprovedRandom(long seed)
	{
		super(seed);
	}
	
	public int IntRandom(int min, int max)
	{	
		ImprovedRandom r=new ImprovedRandom();
		return r.nextInt(max-min)+min;
	}
}
