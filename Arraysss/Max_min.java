package Arraysss;

import java.util.Scanner;

public class Max_min
{
	public int[] accept() 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the no of value u want to store : ");
		int size =sc.nextInt();
		System.out.println("enter the no's one by one : ");
		int[] a=new int [size];
			for(int i=0;i<a.length;i++)
			{
				System.out.println("enter "+ (i+1)+" number : ");
				a[i]=sc.nextInt();
			}
			
			return a;
	}
	
	
	public int[] Max() 
	{
		int[] value=accept();
		int largest=value[0];
		for(int i=0;i<value.length;i++)
		{
			if(value[i]>largest)
			{
				largest=value[i];
			}
		}
		System.out.println("The largest no is : "+largest);
		return value;
	}
	
	public int[] Min() 
	{
		int[] value=Max();
		int smallest=value[0];
		for(int i=0;i<value.length;i++)
		{
			if(value[i]<smallest)
			{
				smallest=value[i];
			}
		}
		System.out.println("The smallest  no is : " +smallest);
		return value;
	}
	
	public int[] ascending() 
	{
		int[] value=Min();
		int temp;
		System.out.println("Sorting of array in asscending order : ");
		for(int i=0;i<value.length;i++)
		{
			for(int j=i+1;j<value.length;j++)
			{
				if(value[i]>value[j])
				{
					temp=value[i];
					value[i]=value[j];
					value[j]=temp;
				}
			}
			System.out.print(value[i]+" ");
		}
		System.out.println(" ");
		return value;
		
	}
	
	public void desc() 
	{
		int[] value =ascending();
		int temp;
		System.out.println("sorting of array in descending order : ");
		for(int i=0;i<value.length;i++)
		{
			for(int j=i+1;j<value.length;j++)
			{
				if(value[i]<value[j])
				{
					temp=value[i];
					value[i]=value[j];
					value[j]=temp;
				}
			}
			System.out.print(value[i] +" ");
		}
		System.out.println(" ");
	}
	
	public static void main(String[] args) 
	{
		Max_min m = new Max_min();
		m.desc();
	}
}
