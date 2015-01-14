package code.prep.hackerrank.algorithms.search;

import java.util.Scanner;

/**
 * Problem Statement
 * An English text needs to be encrypted. The encryption algorithm first removes the spaces from the text and then 
 * the characters are written into a rectangle (or a square), whose width and height have the following constraints:
 * 		floor(sqrt( len(word) )) <= width, height <= ceil(sqrt( len(word) ))
 * 
 * In case of a rectangle, the number of rows will always be smaller than the number of columns.
 * For example, the sentence "if man was meant to stay on the ground god would have given us roots" is 54 characters long, 
 * so it is written in the form of a rectangle with 7 rows and 8 columns.
 * 
 * ifmanwas 
 * meanttos         
 * tayonthe 
 * groundgo 
 * dwouldha 
 * vegivenu 
 * sroots
 * 
 * Also ensure, height * width >= len(word)
 * 
 * If multiple rectangles satisfy the above conditions, choose the one with the minimum area.
 * The encoded message is obtained by displaying the characters in a column, inserting a space, 
 * and then displaying the next column and inserting a space and so on.For example, the encoded message for the
 * above rectangle is:
 * 
 * imtgdvs fearwer mayoogo anouuio ntnnlvt wttddes aohghn sseoau
 * 
 * You will be given a message in English with no spaces between the words.
 * The maximum message length can be 81 characters. Print the encoded message.
 * 
 * 
 * Sample Input:
 * haveaniceday
 * 
 * Sample Output:
 * hae and via ecy
 *
 */
public class Encryption
{
	private static void printColumn(char[][] mat, int col)
	{
		for (int row = 0; row < mat.length; ++row)
		{
			char tmp = mat[row][col];
			
			if (tmp == ' ')
			{
				continue;
			}
			
			System.out.print(mat[row][col]);
		}
	}
	
	private static void encrypt(String str)
	{
		double sqrt  = Math.sqrt(str.length());
		
		int width    = (int) Math.floor(sqrt);
		int height   = (int) Math.ceil(sqrt);
		
		if (!(width * height >= str.length()))
		{
			++width;
		}
		
		char[][] mat = new char[width][height];
		
		int currentPos = 0;
		for (int i = 0; i < width; ++i)
		{
			for (int j = 0; j < height; ++j)
			{
				char tmp;
				try
				{
					tmp = str.charAt(currentPos);
					++currentPos;
				}
				catch (StringIndexOutOfBoundsException e)
				{
					tmp = ' ';
				}
				mat[i][j] = tmp;
			}
		}
		
		for (int i = 0; i < height; ++i)
		{
			printColumn(mat, i);
			System.out.print(' ');
		}
	}
	
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		String 	str		= scanner.next();
		
		str.replaceAll("\\s+", "");
		encrypt(str);
		scanner.close();
	}

}
