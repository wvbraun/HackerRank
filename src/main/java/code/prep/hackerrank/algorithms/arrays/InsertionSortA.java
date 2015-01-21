package code.prep.hackerrank.algorithms.arrays;

import java.util.Scanner;

/**
 * Problem Statement
 * 
 * Sorting 
 * One common task for computers is to sort data. For example, people might 
 * want to see all their files on a computer sorted by size. Since sorting is 
 * a simple problem with many different possible solutions, it is often used 
 * to introduce the study of algorithms.
 * 
 * Insertion Sort 
 * These challenges will cover Insertion Sort, a simple and intuitive sorting 
 * algorithm. We will first start with an already sorted list.
 * 
 * Insert element into sorted list 
 * Given a sorted list with an unsorted number V in the right-most cell, 
 * can you write some simple code to insert V into the array so it remains sorted?
 * Print the array every time a value is shifted in the array until the array is 
 * fully sorted. The goal of this challenge is to follow the correct order of 
 * insertion sort.
 * 
 * Guideline: You can copy the value of V to a variable, and consider its cell 
 * "empty". Since this leaves an extra cell empty on the right, you can shift 
 * everything over until V can be inserted. This will create a duplicate of each 
 * value, but when you reach the right spot, you can replace a value with V.
 * 
 * Input Format 
 * There will be two lines of input:
 * 	s - the size of the array
 * 	ar - the sorted array of integers
 * 
 * Output Format 
 * On each line, output the entire array every time an item is shifted in it.
 * 
 * Constraints 
 * 1<=s<=1000 
 * -10000<=x<= 10000, x ∈ ar
 * 
 * Sample Input
 * 5
 * 2 4 6 8 3
 *
 * Sample Output
 * 2 4 6 8 8 
 * 2 4 6 6 8 
 * 2 4 4 6 8 
 * 2 3 4 6 8 
 */
public class InsertionSortA 
{
	
	private static void printArray(int[] ls)
	{
		for (int i = 0; i < ls.length - 1; ++i)
		{
			System.out.print(ls[i] + " ");
		}
		System.out.println(ls[ls.length - 1]);
	}
	
	private static boolean isSorted(int[] ls)
	{
	   boolean isSorted = true;
	   
	   for (int i = 0; i < ls.length - 1; ++i)
	   {
	      if (ls[i] > ls[i+1])
	      {
	         isSorted = false;
	         break;
	      }
	   }
	   
	   return isSorted;
	}
	
	private static void fixArray(int n, int i, int[] ls)
	{
	   for (int j = i; j >= 0; --j)
	   {
	      if (j == 0)
	      {
	         ls[j] = n;
	      }
	      else if (n > ls[j - 1])
	      {
	         ls[j] = n;
	         printArray(ls);
	         break;
	      }
	      else
	      {
	         ls[j] = ls[j-1];
	      }
	      printArray(ls);
	   }
	}
	
	private static void sort(int[] ls)
	{
		int i, n;
		
		while (!isSorted(ls))
		{
   		for (i = 0; i < ls.length - 1; ++i)
   		{
   		   if (ls[i] > ls[i+1])
   		   {
   		      n = ls[i+1];
   		      fixArray(n, i+1, ls);
   		   }
   		}
		}
	}
	
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		int 	n 		= scanner.nextInt();
		int[]   ls		= new int[n];
		
		for (int i = 0; i < n; ++i)
		{
			ls[i] = scanner.nextInt();
		}
		
		sort(ls);
		scanner.close();
	}

}
