package code.prep.hackerrank.algorithms.search;

import java.util.Scanner;

/**
 * Problem Statement
 * Mr K has a rectangular land (m x n). There are marshes in the land where the fence cannot hold. Mr K 
 * wants you to find the perimeter of the largest rectangular fence that can be built on this land.
 * 
 * Input format
 * First line contains m and n. The next m lines contains n characters describing the state of the land. 
 * 'x' (ascii value: 120) if it is a marsh and '.' ( ascii value:46) otherwise.
 * 
 * Constraints
 * 2<=m,n<=500
 * 
 * Output Format
 * Output contains a single integer - the largest perimeter. If the rectangular fence cannot be built, 
 * print "impossible" (without quotes)
 * 
 * Sample Input:
 * 4 5
 * .....
 * .x.x.
 * .....
 * .....
 *
 * Sample Output:
 * 14
 */

public class MrKMarsh 
{
	
	private static boolean hasMarsh(char[][] land, int i)
	{
		return (land[0][i] == 'x' 				|| 
				land[land.length - 1][i] == 'x' ||
				land[i][0] == 'x'  				||
				land[i][land.length - 1] == 'x');
	}
	
	private static void findPerimiter(char[][] land, int m, int n)
	{
		int perimiter = 0;
		
		for (int i = 0; m > 0 && n > 0; ++i)
		{
			if (hasMarsh(land, i))
			{
				--m;
				--n;
			}
			else
			{
				perimiter = (2 * (m - 1)) + (2 * (n - 1));
				break;
			}
		}
		
		if (perimiter == 0)
		{
			System.out.println("impossible");
		}
		else
		{
			System.out.println(perimiter);
		}
	}
	
	public static void main(String[] args)
	{
		int    i, j, m, n;
		String str;
		
		Scanner  scanner = new Scanner(System.in);
			     m 	     = scanner.nextInt();
				 n 	     = scanner.nextInt();
		char[][] land    = new char[m][n];
		
		for (i = 0; i < m; ++i)
		{
			str = scanner.next();
			for (j = 0; j < n; ++j)
			{
				land[i][j] = str.charAt(j);
			}
		}
		
		findPerimiter(land, m, n);
		scanner.close();
	}

}
