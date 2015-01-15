package code.prep.hackerrank.algorithms.search;

import java.util.Scanner;

/**
 * Problem Statement
 * You have a rectangular board consisting of N rows, numbered from 1 to N, and M columns, numbered 
 * from 1 to M. The top left is (1,1) and the bottom right is (N,M). Initially - at time 0 - there is 
 * 'a coin on the top-left cell of your board. Each cell of your board contains one of these letters:
 * 		*: Exactly one of your cells has letter '*'.
 * 		U: If at time t, the coin is on the cell(i,j) and cell(i,j) has letter 'U', the coin will be 
 * 		   on the cell(i-1,j) in time t+1, if i > 1. Otherwise there is no coin on your board at time t+1.
 * 		L: If at time t, the coin is on the cell(i,j) and cell(i,j) has letter 'L', the coin will be on 
 * 		   the cell(i,j-1) in time t+1, if j > 1. Otherwise there is no coin on your board at time t+1.
 * 		D: If at time t, the coin is on the cell(i,j) and cell(i,j) has letter 'D', the coin will be on 
 * 		   the cell(i+1,j) in time t+1, if i < N. Otherwise there is no coin on your board at time t+1.
 * 		R: If at time t, the coin is on the cell(i,j) and cell(i,j) has letter 'R', the coin will be on 
 * 		   the cell(i,j+1) in time t+1, if j < M. Otherwise there is no coin on your board at time t+1.
 * 
 * When the coin reaches a cell that has letter '*', it will stay there permanently. 
 * When you punch on your board, your timer starts and the coin moves between cells. 
 * Before starting the game, you can make operations to change the board, such that, you are sure that 
 * at time K the coin will reach the cell having letter '*'. In each operation you can select a cell 
 * with some letter other than '*' and change the letter to 'U', 'L', 'R' or 'D'. You need to carry out 
 * as few operations as possible in order to achieve your goal. Your task is to find the minimum number 
 * of operations.
 * 
 * Input: 
 * The first line of input contains three integers N and M and K. Next N lines contains M letters which describe your board.
 * 
 * Output: 
 * Print an integer which represents the minimum number of operations required to achieve your goal. If you cannot achieve your goal, print -1 .
 * 
 * Constraints 
 * N, M <= 51 
 * K <= 1000
 * 
 * Sample Input:
 * 2 2 3  
 * RD  
 * *L
 * 
 * Sample Output: 
 * 0
 * 
 * Sample Input:
 * 2 2 1  
 * RD  
 * *L
 * 
 * Sample Output:
 * 1
 */

public class CoinOnTheTable
{

	private static boolean canReachGoal(char[][] board, int k)
	{
		boolean reachable = true;
		
		for (int i = 0; i < board.length; ++i)
		{
			for (int j = 0; j < board[i].length; ++j)
			{
				
			}
		}
		
		return reachable;
	}
	
	private static void minOperations(char[][] board, int k)
	{
		int operations = 0;
		
		while (k > 0)
		{
			if (canReachGoal(board, k))
			{
				break;
			}
		}
		
		System.out.println(operations);
	}
	
	public static void main(String[] args)
	{
		int 	 i, j, k, m, n;
		String   row;
		char[][] board;
		Scanner  scanner = new Scanner(System.in);
		
		n 	  = scanner.nextInt();
		m 	  = scanner.nextInt();
		k     = scanner.nextInt();
		board = new char[n][m];
		
		for (i = 0; i < n; ++i)
		{
			row = scanner.next();
			for (j = 0; j < m; ++j)
			{
				board[i][j] = row.charAt(j);
			}
		}
		
		minOperations(board, k);
		scanner.close();
	}
}
