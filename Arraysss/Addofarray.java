package Arraysss;

public class Addofarray 
{
	public static void main(String[] args) 
	{

		int[] a= {10,20,30,40,50};
		int[] b= {10,20,30,40,50};
		
		int[] c=new int [a.length];
		
		if(a.length==b.length)
		{
			for(int i=0;i<a.length;i++)
			{
				c[i]=a[i]+b[i];
			}
			
			for(int i=0;i<a.length;i++)
			{
				System.out.println(c[i]);
			}
		}
		else
		{
			System.out.println("The size of array are not equal");
		}
	}
}
