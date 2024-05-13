package Arraysss;

import java.util.Scanner;

public class Klarg_smal 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int[] a= new int [20];
		int k=9,temp;
		System.out.println("Enter the element : ");
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]<a[j])
				{
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
			
			System.out.println(a[i]);
			
			if(i==k-1)
			{
				System.out.println("2nd largest no is  ");
				System.out.println(a[i]);
				break;
			}
				
		}
	}
}
