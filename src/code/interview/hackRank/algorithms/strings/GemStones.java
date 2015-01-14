package code.interview.hackRank.algorithms.strings;

import java.util.Scanner;

/**
 * Problem Statement
 * John has discovered various rocks. Each rock is composed of various elements, and each element is represented by a 
 * lowercase latin letter from 'a' to 'z'. An element can be present multiple times in a rock. An element is called a 
 * 'gem-element' if it occurs at least once in each of the rocks.
 * Given the list of N rocks with their compositions, display the number of gem-elements that exist in those rocks.
 * 
 * Input Format 
 * The first line consists of N, the number of rocks. 
 * Each of the next N lines contain rocks' composition. Each composition consists of lowercase letters of English alphabet.
 * 
 * Output Format 
 * Print the number of gem-elements that are common in these rocks. If there are none, print 0.
 * 
 * Constraints 
 * 1 ≤ N ≤ 100 
 * Each composition consists of only lowercase latin letters ('a'-'z'). 
 * 1 ≤ Length of each composition ≤ 100
 * 
 * Sample Input
 * 3
 * abcdde
 * baccd
 * eeabg
 * 
 * Sample Output
 * 2

 *
 */
public class GemStones
{
	
	private static boolean isGemStone(String[] rocks, char gem)
	{
		int amt = 0;
		
		for (String rock : rocks)
		{
			for (int i = 0; i < rock.length(); ++i)
			{
				char c = rock.charAt(i);
				
				if (c == gem)
				{
					++amt;
					break;
				}
			}
		}
		
		return (amt == rocks.length);
		
	}
	
	private static void printGemStones(String[] rocks)
	{
		int    				        numberOfStones = 0;
		
		for (String rock : rocks)
		{
			for (int i = 0; i < rocks.length; ++i)
			{
				char gem = rock.charAt(i);
				if (isGemStone(rocks, gem))
				{
					++numberOfStones;
					break;
				}
			}
		}
		System.out.println(numberOfStones);	
	}
	
	public static void main(String[] args)
	{
		Scanner  scanner = new Scanner(System.in);
		int		 n 		= scanner.nextInt();
		String[] rocks  = new String[n];
		
		for (int i = 0; i < n; ++i)
		{
			rocks[i] = scanner.next();
		}
		
		printGemStones(rocks);
		scanner.close();
	}

}
