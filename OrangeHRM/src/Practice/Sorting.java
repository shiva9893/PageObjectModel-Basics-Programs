package Practice;

import org.testng.annotations.Test;

public class Sorting {
	
	@Test
	public void sorting()
	{
		int a[]= {2,4,5,9,8,7,3,6};
		
		int temp=0;
		
		 for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]>a[j] && a[j]!=7)
				{
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
					
				}
				 
			}
			
		}
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
		}
	}

}
