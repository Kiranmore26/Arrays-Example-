package Arraysss;

public class Singlerepeated
{
	public static void main(String[] args) 
	{
		int[] a= {10,20,30,60,40,30,20,10,40};
		int res=a[0];
		for(int i=1;i<a.length;i++)
		{
			res=res^a[i];
		}
		System.out.println(res +" ");
	}
}
