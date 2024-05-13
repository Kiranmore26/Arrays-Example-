package Arraysss;
// find x no is present in list or no
public class X_no 
{
	public static void main(String[] args) 
	{
		int[] a= {10,20,30,40};
		int x=10;
		boolean found=true;
		for(int i=0;i<a.length;i++)
		{
			if(a[i]==x)
			{
				found=false;
				break;
			}
		}
		if(!found)
		{
			System.out.println("the element is present : ");
		}
		else
		{
			System.out.println("element not present");
		}
	}
}
