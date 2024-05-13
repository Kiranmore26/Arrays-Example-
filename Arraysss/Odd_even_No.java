package Arraysss;

public class Odd_even_No 
{
	public static void main(String[] args)
	{
		int[] a= {10,20,30,60,45,79,21,64,78,55};
		for(int i=0;i<a.length;i++)
		{
			if(a[i]%2==0)
			{
				System.out.println("it is a odd no :" +a[i]);
			}
			else 
			{
				System.out.println("it is s even no :"+a[i]);
			}
		}
	}
}
