package code.prep.hackerrank.algorithms.search;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Problem Statement
 * Given N integers, count the number of pairs of integers whose difference is K.
 * 
 * Input Format 
 * The 1st line contains N & K (integers). 
 * The 2nd line contains N numbers of the set. All the N numbers are distinct.
 * 
 * Output Format 
 * An integer that tells the number of pairs of integers whose difference is K.
 * 
 * Constraints: 
 * N <= 105 
 * 0 < K < 109
 *  
 * Each integer will be greater than 0 and at least K smaller than 231-1
 * 
 * Sample Input 1:
 * 5 2  
 * 1 5 3 4 2  
 *
 * Sample Output 1:
 * 3
 * 
 * Sample Input 2:
 * 10 1  
 * 363374326 364147530 61825163 1073065718 1281246024 1399469912 428047635 491595254 879792181 1069262793 
 * 
 * Sample Output 2:
 * 0
 */

public class Pairs
{
	private static void pairs(int[] ls, int k)
	{
	   int pairs = 0;
	   
	   Arrays.sort(ls);
	   
	   int i = 0;
	   int j = 1;
	   
	   while (j < ls.length)
	   {
	      if (ls[j] - ls[i] == k)
	      {
	         ++i;
	         ++j;
	         ++pairs;
	      }
	      else if (ls[j] - ls[i] > k)
	      {
	         ++i;
	      }
	      else
	      {
	         ++j;
	      }
	     
	   }
	   
	   System.out.println(pairs);
	   
	}
	
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		int     n 	    = scanner.nextInt();
		int 	  k 		 = scanner.nextInt();
		int[]   ls      = new int[n];
		
		for (int i = 0; i < n; ++i)
		{
		   ls[i] = scanner.nextInt();
		}

		pairs(ls, k);
		scanner.close();
	}

}
