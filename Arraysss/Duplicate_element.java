package Arraysss;

import java.util.HashSet;
import java.util.Set;

public class Duplicate_element 
{
	public static void main(String[] args) 
	{
		int[] a= {10,20,30,40,50,60,10,20,50,10};
		
		for(int i=0;i<a.length;i++)
		{
			for(int j=1+i;j<a.length;j++)
			{
				if(a[i]==a[j] && i!=j)
				{
					System.out.println(a[j]);
				}
			}
		}
		
		System.out.println("*************************************************************************************");
		
					Set s = new HashSet();
					
					for(int no:a)
					{
						if(s.add(no)==false)
						{
							System.out.println("the duplicate elements are" +no);
						}
					}
		
		
	}

}
