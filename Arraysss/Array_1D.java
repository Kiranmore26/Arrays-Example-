package Arraysss;

import java.util.Scanner;

import javax.sound.midi.SysexMessage;

public class Array_1D 
{
	public static void main(String[] args) 
	{
		// Types of  Declaration
		int [] a;
		int[] b;
		int c[];
		int []d;
		
		//creation 0 is allowed but negative numbers cause runtime exception
		a=new int [3];
		int[] e=new int [5];
		
		//Initialization
		e[0]=1;
		e[1]=1;
		e[2]=1;
		e[3]=1;
		e[4]=1;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter values to store : ");
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		
		//retrieve
		
		for(int i=0;i<a.length;i++)
		{
			if(a[i]%2==0)
			{
				
			}
			System.out.println(a[i]);
		}
		
		
		System.out.println("_______________________________");
		
		for(int i:e)
		{
			System.out.println(i);
		}
	}
}
