package code.interview.hackerRank.algorithms.arrays;

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
public class InsertionSort 
{
	
	private static void printArray(int[] ls)
	{
		for (int i = 0; i < ls.length - 1; ++i)
		{
			System.out.print(i + " ");
		}
		System.out.println(ls[ls.length - 1]);
	}
	
	private static void sort(int[] ls)
	{
		int i, j, x;
		
		for (i = 1; i < ls.length; ++i)
		{
			x = ls[i];
			j = i;
			while (j > 0 && ls[j - 1] > x)
			{
				ls[j] = ls[j - 1];
				printArray(ls);
				--j;
			}
			ls[j] = x;
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
