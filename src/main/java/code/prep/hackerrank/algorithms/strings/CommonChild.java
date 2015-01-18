package code.prep.hackerrank.algorithms.strings;

import java.util.HashMap;
import java.util.Scanner;

/**
 * DIFFICULT
 * 
 * Problem Statement
 * Given two strings a and b of equal length, what's the longest string (S) that can be constructed such that 
 * S is a child of both a and b.
 * 
 * A string x is said to be a child of a string y, if x can be formed by deleting 0 or more characters from y.
 * 
 * Input format
 * Two strings a and b with a newline separating them.
 * 
 * Constraints
 * All characters are upper-cased and lie between ASCII values 65-90. The maximum length of the strings a and b 
 * is 5000.
 * 
 * Output format
 * Length of the string S
 * 
 * Sample Input  0
 * HARRY
 * SALLY
 * 
 * Sample Output 0
 * 2
 * 
 * Sample Input  1
 * AA
 * BB
 * 
 * Sample Output 1
 * 0
 *
 */

public class CommonChild
{
   private static void findS(String a, String b)
   {
      HashMap<Character, Integer> hash = new HashMap<Character, Integer>();
      
      for (int i = 0; i < a.length(); ++i)
      {
         char c = a.charAt(i);
         if (isMember(c, b))
         {
            hash.put(c, 1);
         }
      }
      
      System.out.println(hash.size());
   }
   
   private static boolean isMember(char e, String str)
   {
      boolean isMember = false;
      
      for (int i = 0; i < str.length(); ++i)
      {
         if (e == str.charAt(i))
         {
            isMember = true;
            break;
         }
      }
      
      return isMember;
   }
   
   public static void main(String[] args)
   {
      Scanner scanner = new Scanner(System.in);
      String  a       = scanner.next();
      String  b       = scanner.next();
      findS(a,  b);
      scanner.close();
   }
}
