package problem5;

import java.util.StringTokenizer;

public class ImprovedStringTokenizer extends StringTokenizer
{
	
	public ImprovedStringTokenizer(String str)
	{
		super(str);
	}

	public ImprovedStringTokenizer(String strInput, String split)
	{
		super(strInput,split);
	}


	public String [] returnWordsIntoArray(String input, String split)
	{
		ImprovedStringTokenizer striToken=new ImprovedStringTokenizer(input,split);
		
		int size;
		String words[];
		
		size = striToken.countTokens();
		words = new String[size];
		
		while(striToken.hasMoreTokens())
		{
			for(int i=0; i<words.length; i++)
			{
				words[i]=striToken.nextToken();
			}
		}
		return words;
	}
}
