package Arraysss;

import java.util.Arrays;
import java.util.Scanner;

public class Arrayss_1 
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of array");
		int size=sc.nextInt();
		int[] a= new int [size];
		
		for(int j=0;j<size;j++)
		{
			System.out.println("Enter "+ (j+1)+" value");
			a[j]=sc.nextInt();
			
		}
		
		Arrays.sort(a);
		
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
		}
	}

}
