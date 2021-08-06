package Lec21;

import java.util.Arrays;

public class RatInMaze {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] maze = {{0,1,0,0},{0,0,0,1},{0,0,1,0},{1,0,0,0},{1,1,0,0}};
		int[][] ans = new int[maze.length][maze[0].length];
		ratMaze(maze, ans, 0, 0);
	}
	
	public static void ratMaze(int[][] maze,int [][] ans,int cr,int cc)
	{
		if (cc<0||cr<0||cc>=maze[0].length||cr>=maze.length||maze[cr][cc] == 1)
		{
			return;
		}
		else if(cr == maze.length-1 && cc == maze[0].length-1)
		{
			ans[cr][cc] = 1;
			
			for(int[] val:ans)
			{
				System.out.println(Arrays.toString(val));
			}
			System.out.println();
			
			ans[cr][cc] = 0;
		}
		else
		{
			int[] row = {-1,0,1,0};
			int[] col = {0,1,0,-1};
			for(int i = 0; i < row.length;i++)
			{
//				if(cr+row[i] >= 0 && cr+row[i] < maze.length && cc+col[i] >= 0 && cc+col[i] < maze[0].length && maze[cr+row[i]][cc+col[i]] != 1) {
					maze[cr][cc] = 1;
					ans[cr][cc] = 1;
					ratMaze(maze, ans, cr+row[i], cc+col[i]);
					maze[cr][cc] = 0;
					ans[cr][cc] = 0;
//				}
			}
		}
	}

}
