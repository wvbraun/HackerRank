package code.interview.hackerRank.algorithms.search;

import java.util.Scanner;

public class CountLuck 
{

	private static void waveHand(char[][] forest, int row, int col)
	{
		
	}
	
	private static void isPossible(char[][] forest, int k)
	{
		
	}
	
	public static void main(String[] args)
	{
		int 	 n, m, k;
		String   str;
		char[][] forest;
		Scanner  scanner = new Scanner(System.in);
		int 	 t		 = scanner.nextInt();

		while (t > 0)
		{
			n 	   = scanner.nextInt();
			m 	   = scanner.nextInt();
			k 	   = scanner.nextInt(); 
			forest = new char[n][m];
			
			for (int i = 0; i < n; ++i)
			{
				str = scanner.next();
				for (int j = 0; j < m; ++j)
				{
					forest[i][j] = str.charAt(j);
				}
			}

			isPossible(forest, k);
			--t;
		}
		
		scanner.close();
	}
}
