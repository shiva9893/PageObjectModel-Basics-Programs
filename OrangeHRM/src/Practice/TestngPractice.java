package Practice;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestngPractice {
	@Test
	
	@Parameters({"Name"})
  
  public void f(String name) {
	  
	  System.out.println(name);
	  
	  
  }
	@Test
  
	@Parameters({"Age","place"})
	
	public void twoparam(String age,String place)
	{
		System.out.println("age is "+age);
		System.out.println("place is "+place);
	}
}
