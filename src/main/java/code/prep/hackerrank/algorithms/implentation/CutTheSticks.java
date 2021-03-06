package code.prep.hackerrank.algorithms.implentation;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;


/**
 * Cut The Sticks
 * 
 * Problem Statement
 * You are given N sticks, where each stick is of positive integral length.
 * A cut operation is performed on the sticks such that all of them are reduced 
 * by the length of the smallest stick.
 * 
 * Suppose we have 6 sticks of length: 5 4 4 2 2 8
 * then in one cut operation we make a cut of length 2 from each of the 6 sticks. 
 * For next cut operation 4 sticks are left (of non-zero length), 
 * whose length are: 3 2 2 6
 * 
 * Above step is repeated till no sticks are left.
 * Given length of N sticks, print the number of sticks that are cut in subsequent 
 * cut operations.
 * 
 * Input Format 
 * The first line contains a single integer N. 
 * The next line contains N integers: a0, a1,...aN-1 separated by space, where 
 * ai represents the length of ith stick.
 * 
 * Output Format 
 * For each operation, print the number of sticks that are cut in separate line.
 * 
 * Constraints 
 * 1 ≤ N ≤ 1000 
 * 1 ≤ ai ≤ 1000
 * 
 * Sample Input
 * 6
 * 5 4 4 2 2 8
 * 
 * Sample Output
 * 6
 * 4
 * 2
 * 1
 * 
 * Sample Case
 * sticks-length        length-of-cut   sticks-cut
 * 5 4 4 2 2 8             2               6
 * 3 2 2 _ _ 6             2               4
 * 1 _ _ _ _ 4             1               2
 * _ _ _ _ _ 3             3               1
 * _ _ _ _ _ _           DONE            DONE
 */


public class CutTheSticks
{
	private static int getSmallest(ArrayList<Integer> sticks)
	{
		int smallest = sticks.get(0);
		
		for (int i = 1; i < sticks.size(); ++i)
		{
			int tmp = sticks.get(i);
			if (tmp < smallest)
			{
				smallest = tmp;
			}
		}
		
		return smallest;
	}
	
	private static void cutSticks(ArrayList<Integer> sticks)
	{
		int smallest = getSmallest(sticks);
		
		sticks.removeAll(Arrays.asList(smallest));
		
		for (int i = 0; i < sticks.size(); ++i)
		{
			int tmp = sticks.get(i) - smallest;
			sticks.remove(i);
			sticks.add(i, tmp);
		}
	}
	
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		int     n 	    = scanner.nextInt();

		ArrayList<Integer> sticks = new ArrayList<Integer>();
		for (int i = 0; i < n; ++i)
		{
			sticks.add(scanner.nextInt());
		}
		
		while (!sticks.isEmpty())
		{
			System.out.println(sticks.size());
			cutSticks(sticks);
		}
		scanner.close();
	}

}
