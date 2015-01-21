package code.prep.hackerrank.algorithms.arrays;

import java.io.ByteArrayInputStream;
import java.util.Scanner;

public class InsertionSortATestable 
{
   
   public InsertionSortATestable(String str)
   {
      System.setIn(new ByteArrayInputStream(str.getBytes()));
   }
   
   
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
   
   private static int[] sort(int[] ls)
   {
      int i, n;
      
      while (!isSorted(ls))
      {
         for (i = ls.length - 2; i >= 0; --i)
         {
            if (ls[i] > ls[i+1])
            {
               n = ls[i+1];
               fixArray(n, i+1, ls);
            }
         }
      }
      
      return(ls);
   }
   
   public int[] start()
   {
      Scanner scanner = new Scanner(System.in);
      int   n     = scanner.nextInt();
      int[]   ls     = new int[n];
      
      for (int i = 0; i < n; ++i)
      {
         ls[i] = scanner.nextInt();
      }
      
      scanner.close();
      return(sort(ls));

   }

}
