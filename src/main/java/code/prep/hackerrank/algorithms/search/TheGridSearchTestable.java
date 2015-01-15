package code.prep.hackerrank.algorithms.search;

import java.io.ByteArrayInputStream;
import java.util.Scanner;
import java.util.Arrays;

public class TheGridSearchTestable 
{
	
	public TheGridSearchTestable(String str)
	{
		System.setIn(new ByteArrayInputStream(str.getBytes()));
	}
	
	private static int[][] subMatrix(int[][] mat, int startR, int endR, int startC, int endC)
	{
		int[][] sub = new int[endR - startR][endC - startC];
		
		for (int subI = 0, matI = startR; matI < endR; ++subI, ++matI)
		{
			for (int subJ = 0, matJ = startC; matJ < endC; ++subJ, ++matJ)
			{
				int tmp = mat[matI][matJ];
				sub[subI][subJ] = tmp;
			}
		}
		
		return sub;
	}
	
	private static boolean samePattern(int[][] mat1, int[][] mat2)
	{
		boolean samePattern = true;
		
		if (mat1 == null && mat2 != null || mat2 == null && mat1 != null)
		{
			samePattern = false;
		}
		else if (mat1.length == mat2.length && mat1[0].length == mat2[0].length)
		{
			loop:
				for (int i = 0; i < mat1.length; ++i)
				{
					for (int j = 0; j < mat1[0].length; ++j)
					{
						if (mat1[i][j] != mat2[i][j])
						{
							samePattern = false;
							break loop;
						}
					}
				}
		}
		else
		{
			samePattern = false;
		}
		
		return samePattern;
	}
	private static void containsPattern(int[][] grid, int[][] pattern, int r, int c)
	{
		String  containsPattern = "NO";
		int[][] tmp				= new int[r][c];
		
		loop:
			for (int i = 0; i + r < grid.length; ++i)
			{
				for (int j = 0; j + c< grid[i].length; ++j)
				{
					tmp = subMatrix(grid, i, i + r, j, j + c);
					//if (samePattern(pattern, tmp))
					if (Arrays.deepEquals(pattern, tmp))
					{
						containsPattern = "YES";
						break loop;
					}
				}
			}
		
		System.out.println(containsPattern);
	}
	
	public static void main(String[] args)
	{
		int		C, c, i, j, t, R, r;
		String  row;
		int[][] grid, pattern;
		Scanner scanner = new Scanner(System.in);
		
		t = scanner.nextInt();
		
		while (t > 0)
		{
			R    = scanner.nextInt();
			C    = scanner.nextInt();
			grid = new int[R][C];
			
			for (i = 0; i < R; ++i)
			{
				row = scanner.next();
				for (j = 0; j < C; ++j)
				{
					grid[i][j] = Character.getNumericValue(row.charAt(j));	
				}
			}
			
			r       = scanner.nextInt();
			c       = scanner.nextInt();
			pattern = new int[r][c];
			
			for (i = 0; i < r; ++i)
			{
				row = scanner.next();
				for (j = 0; j < c; ++j)
				{
					pattern[i][j] = Character.getNumericValue(row.charAt(j));
				}
			}
			
			containsPattern(grid, pattern, r, c);
			--t;
		}
		
		scanner.close();
	}

}
