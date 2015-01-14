package code.prep.hackerrank.algorithms.search;

import java.io.ByteArrayInputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Scanner;

public class MissingNumbersTestable
{
	public MissingNumbersTestable(String str)
	{
		System.setIn(new ByteArrayInputStream(str.getBytes()));
	}
	
	private String findMissingNumbers(int[] a, int[] b)
	{
		int 					  i, n, amt;
		StringBuilder			  sb			 = new StringBuilder();
		ArrayList<Integer> 		  missingNumbers = new ArrayList<Integer>();
		HashMap<Integer, Integer> aHash 		 = new HashMap<Integer, Integer>();
		HashMap<Integer, Integer> bHash			 = new HashMap<Integer, Integer>();

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
		for (i = 0; i < missingNumbers.size(); ++i)
		{
			int num = missingNumbers.get(i);
			if (i < missingNumbers.size() - 1)
			{
				sb.append(num + " ");
			}
			else
			{
				sb.append(num);
			}
		}
		
		return sb.toString();
	}
	
	public String start()
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

		scanner.close();
		System.setIn(System.in);
		return findMissingNumbers(a, b);
	}

}
