package code.prep.hackerrank.algorithms.greedy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

/*
 * Problem Statement
 * 
 * Mark and Jane are very happy after having their first kid. Their son is very fond of toys, 
 * so Mark wants to buy some. There are N different toys lying in front of him, tagged with their prices, 
 * but he has only $K. He wants to maximize the number of toys he buys with this money.
 * 
 * Now, you are Mark's best friend and have to help him buy as many toys as possible.
 * 
 * Input Format 
 * The first line contains two integers, N and K, followed by a line containing N space separated integers 
 * indicating the products' prices.
 * 
 * Output Format 
 * An integer that denotes maximum number of toys Mark can buy for his son.
 * 
 * Constraints 
 * 1<=N<=105 
 * 1<=K<=109 
 * 1<=price of any toy<=109 
 * A toy can't be bought multiple times.
 * 
 * Sample Input
 * 7 50
 * 1 12 5 111 200 1000 10
 * 
 * Sample Output
 * 4 -> he can only buy 4 toys at most. These toys have the following prices: 1, 12, 5, 10.
 * 
 */

public class MarksAndToys
{
   
   public static int findToys(int[] prices, int k)
   {
      int i                   = 0;
      int total               = 0;
      ArrayList<Integer> toys = new ArrayList<Integer>();
      
      Arrays.sort(prices);
      
      while (total <= k)
      {
         toys.add(prices[i]);
         total += prices[i];
         ++i;
      }
      
      return toys.size();
   }
   
   public static void Main(String[] args)
   {
      int     n, k;
      int[]   prices;
      Scanner scanner = new Scanner(System.in);
      
      n = scanner.nextInt();
      k = scanner.nextInt();
      
      prices = new int[n];
      
      for (int i = 0; i < n; ++i)
      {
         prices[i] = scanner.nextInt();
      }
      
      int size = findToys(prices, k);
      System.out.println(size);
      scanner.close();
   }

}
