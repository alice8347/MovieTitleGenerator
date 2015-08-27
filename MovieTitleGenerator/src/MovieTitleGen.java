import java.net.URL;
import java.util.Scanner;

public class MovieTitleGen
{
	public static void main(String[] args) throws Exception
	{

		String[] adjectives = arrayFromUrl("https://cs.leanderisd.org/txt/adjectives.txt");
		String[] nouns      = arrayFromUrl("https://cs.leanderisd.org/txt/nouns.txt");
		
		int ai = 0 + (int)(Math.random() * adjectives.length);
		int nn = 0 + (int)(Math.random() * nouns.length);
		
		String adj = adjectives[ai];
		String n = nouns[nn];

		System.out.println("Myxyllplyk's Random Movie Title Generator\n");

		System.out.print("Choosing randomly from " + adjectives.length + " adjectives ");
		System.out.println("and " + nouns.length + " nouns (" + (adjectives.length * nouns.length) + " combinations).");

		String adjective = adj.toUpperCase().charAt(0) + adj.substring(1); // Capitalize the first character
		String noun = n.toUpperCase().charAt(0) + n.substring(1); // Capitalize the first character

		System.out.println("Your movie title is: " + adjective + " " + noun);
	}

	/**
	*	@param url - the URL to read words from
	*	@return An array of words, initialized from the given URL
	*/	
	public static String[] arrayFromUrl(String url) throws Exception
	{
		Scanner fin = new Scanner((new URL(url)).openStream());
		int count = fin.nextInt();

		String[] words = new String[count];

		for (int i = 0; i < words.length; i++)
		{
			words[i] = fin.next();
		}
		fin.close();

		return words;
	}

}