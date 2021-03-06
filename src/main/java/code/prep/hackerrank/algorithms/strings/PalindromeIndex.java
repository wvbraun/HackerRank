package code.prep.hackerrank.algorithms.strings;


import java.util.Scanner;

/**
 * Problem Statement
 * Russian
 * You are given a string of lowercase letters. Your task is to figure out the index of the character on whose 
 * removal will make the string a palindrome. There will always be a valid solution. 
 * 
 * In case string is already palindrome, then -1 is also a valid answer along with possible indices.
 * 
 * Input Format
 * The first line contains T i.e. number of test cases.
 * T lines follow, each line containing a string.
 * 
 * Output Format
 * Print the position ( 0 index ) of the letter by removing which the string turns into a palindrome. 
 * For string, such as 'bcbc' we can remove b at index 0 or c at index 3. Both the answers are accepted.
 * 
 * Constraints
 * 1 ≤ T ≤ 20 
 * 1 ≤ length of string ≤ 100005 
 * All characters are latin lower case indexed.
 * 
 * Sample Input
 * 3
 * aaab
 * baa
 * aaa
 * 
 * Sample Output
 * 3
 * 0
 * -1

 *
 */
public class PalindromeIndex 
{
	
	private static boolean isPalindrome(String str)
	{
		boolean isPalindrome = true;
		
		for (int i = 0, j = str.length() - 1; i <= j; ++i, --j)
		{
			if (str.charAt(i) != str.charAt(j))
			{
				isPalindrome = false;
				break;
			}
		}
		
		return isPalindrome;
	}
	
	private static void printIndex(String str)
	{
		if (isPalindrome(str))
		{
			System.out.println("-1");
		}
		else
		{
			for (int i = 0; i < str.length(); ++i)
			{
				StringBuilder tmp = new StringBuilder(str.substring(0,i));
				tmp.append(str.substring(i+1));
				if (isPalindrome(tmp.toString()))
				{
					System.out.println(i);
					break;
				}
			}
		}
	}

	public static void main(String[] args)
	{
		String  str;
		
		Scanner scanner = new Scanner(System.in);
		int 	t 	    = scanner.nextInt();
		
		while (t > 0)
		{
			str = scanner.next();
			printIndex(str);
			--t;
		}
		
		scanner.close();
	}
}
