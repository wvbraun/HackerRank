package code.interview.hackerRank.algorithms.search;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Scanner;

/**
 * Problem Statement
 * Numeros, The Artist, had two lists A and B, such that, B was a permutation of A. Numeros was very proud of 
 * these lists. Unfortunately, while transporting them from one exhibition to another, some numbers from List 
 * A got left out. Can you find out the numbers missing from A?
 * 
 * Notes
 * If a number occurs multiple times in the lists, you must ensure that the frequency of that number in both the 
 * lists is the same. If that is not the case, then it is also a missing number.
 * You have to print all the missing numbers in ascending order.
 * Print each missing number once, even if it is missing multiple times.
 * The difference between maximum and minimum number in the list B is less than or equal to 100.
 * 
 * Input Format 
 * There will be four lines of input:
 * 		n - the size of the first list 
 * 		This is followed by n space separated integers that make up the first list. 
 * 		m - the size of the second list 
 * 		This is followed by m space separated integers that make up the second list.
 * 
 * Output Format 
 * Output the missing numbers in ascending order
 * 
 * Constraints 
 * 1<= n,m <= 1000010 
 * 1 <= x <= 10000 , x ∈ B 
 * Xmax - Xmin < 101
 * 
 * Sample Input
 * 10
 * 203 204 205 206 207 208 203 204 205 206
 * 13
 * 203 204 204 205 206 207 205 208 203 206 205 206 204
 * 
 * Sample Output
 * 204 205 206
 *
 */

public class MissingNumbers 
{
	private static boolean contains(int[] ls, int n)
	{
		boolean contained = false;
		
		for (int i = 0; i < ls.length; ++i)
		{
			if (ls[i] == n)
			{
				contained = true;
				break;
			}
		}
		
		return contained;
	}
	
	private static int frequency(int[] ls, int n)
	{
		int frequency = 0;
		
		if (contains(ls, n))
		{
			for (int i = 0; i < ls.length; ++i)
			{
				if (ls[i] == n)
				{
					++frequency;
				}
			}
		}
		
		return frequency;
	}
	
	@SuppressWarnings("unused")
	private static void findMissingNumbers1(int[] a, int[] b)
	{
		int   			   n;
		ArrayList<Integer> missingNumbers = new ArrayList<Integer>();
		
		for (int i = 0; i < b.length; ++i)
		{
			n = b[i];
			
			if (frequency(a, n) != frequency(b, n) && !missingNumbers.contains(n))
			{
				missingNumbers.add(n);
			}
		}
		
		Collections.sort(missingNumbers);
		for (int num : missingNumbers)
		{
			System.out.print(num + " ");
		}
	}
	
	
	private static void findMissingNumbers(int[] a, int[] b)
	{
		int 					  i, n, amt;
		ArrayList<Integer> 		  missingNumbers = new ArrayList<Integer>();
		HashMap<Integer, Integer> aHash 	     = new HashMap<Integer, Integer>();
		HashMap<Integer, Integer> bHash 		 = new HashMap<Integer, Integer>();

		for (i = 0; i < a.length; ++i)
		{
			n = a[i];
			
			if (!aHash.containsKey(n))
			{
				aHash.put(n, 1);
			}
			else
			{
				amt = aHash.get(n);
				aHash.put(n, ++amt);
			}
		}
		for (i = 0; i < b.length; ++i)
		{
			n = b[i];
			
			if (!bHash.containsKey(n))
			{
				bHash.put(n, 1);
			}
			else
			{
				amt = bHash.get(n);
				bHash.put(n, ++amt);
			}
		}
		
		for (int key : bHash.keySet())
		{
			if (!aHash.containsKey(key))
			{
				missingNumbers.add(key);
			}
			else if (!aHash.get(key).equals(bHash.get(key)))
			{
				missingNumbers.add(key);
			}
		}
		
		Collections.sort(missingNumbers);
		for (int num : missingNumbers)
		{
			System.out.print(num + " ");
		}
	}

	public static void main(String[] args)
	{
		int 	i, n, m;
		int[]   a, b;
		Scanner scanner = new Scanner(System.in);
		
		n = scanner.nextInt();
		a = new int[n];
		for (i = 0; i < n; ++i)
		{
			a[i] = scanner.nextInt();
		}
		
		m = scanner.nextInt();
		b = new int[m];
		for (i = 0; i < m; ++i)
		{
			b[i] = scanner.nextInt();
		}

		findMissingNumbers(a, b);
		scanner.close();
	}
}
