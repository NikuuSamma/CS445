package problem4_5_acceptanceTest;

import problem4.ImprovedRandom;
import problem5.ImprovedStringTokenizer;

public class ImprovedClasses 
{
	public static void main(String [] args)
	{
		System.out.println("Problem 4: START");
		
		System.out.println("------------------------");
		ImprovedRandom impr=new ImprovedRandom();
		for(int i=0; i<10 ; i++)
		{
			System.out.println("The random number is:" + " " + impr.IntRandom(3,11));
		}
		
		System.out.println("------------------------");
		System.out.println("Problem 4: END\n");
		
		System.out.println("Problem 5: START");
		System.out.println("------------------------");
		
		String phrase,words[]; 
		ImprovedStringTokenizer imprStringToken;
		
		phrase = "This class is easy";
		imprStringToken = new ImprovedStringTokenizer(phrase," ");
		words = imprStringToken.returnWordsIntoArray(phrase," ");
		
		for(int j=0; j<words.length; j++)
		{
			System.out.println(words[j]);
		}
		
		System.out.println("------------------------");
		System.out.println("Problem 5: END");	
	}
}
