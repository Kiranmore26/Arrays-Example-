package Arraysss;

public class Merge_array 
{
	public static void main(String[] args) 
	{
		int[] a= {10,20,30,40,50};
		int[] b= {60,70,80,90};
		int c_len=a.length+b.length;
		
		int[] c=new int [c_len];
		for(int i=0;i<a.length;i++)
		{
			c[i]=a[i];
		}
		
		for(int i=0;i<b.length;i++)
		{
			c[a.length+i]=b[i];
		}
		
		for(int i=0;i<c.length;i++)
		{
			System.out.println(c[i]);
		}
	}
}
