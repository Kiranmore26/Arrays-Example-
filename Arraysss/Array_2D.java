package Arraysss;

import java.util.Scanner;

public class Array_2D {

	public static void main(String[] args) 
	{
		// Types of  Declaration
		int[][] a;
		int [][] b;
		int c[][];
		int [] [] d;

		
		//creation
		
		int[][] e=new int[2][3];//Matrix
		
		int[][]  f=new int [2][];//Jagged
		f[0]=new int [3];
		f[1]=new int [4];
		
		//initialization
		
		int[][] k= {{10,20,30},{40,50}};
		
		int[][]  g=new int [2][];//Jagged
		g[0]=new int [3];
		g[1]=new int [4];
		g[0][0]=10;
		g[0][1]=10;
		g[0][2]=10;
		g[1][0]=20;
		g[1][1]=20;
		g[1][2]=20;
		g[1][3]=20;
		
		Scanner sc = new Scanner(System.in);
		
		for(int i=0;i<f.length;i++)
		{
			for(int j=0;j<f[i].length;j++)
			{
				f[i][j]=sc.nextInt();
				
			}
			System.out.println();
		}
		
		
	}

}
