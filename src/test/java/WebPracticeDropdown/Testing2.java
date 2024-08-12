package WebPracticeDropdown;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class Testing2 {
	
	@AfterMethod

	public void m1() {
		
		
		System.out.println("This is the m1 method of test2 class with @after Method annotation");
		
	}
	
	@AfterClass
	
    public void m2() {
		
		
		System.out.println("This is the m2 method of test2 class with @after class annotation");
		
	}
	
	@AfterTest
    public void m3() {
		
		
		System.out.println("This is the m3 method of test2 class with @after Test annotation");
		
	}
	
	@Test
	public void main() {
		
		System.out.println("This is a main method of test 2 class");
	}
	
	@AfterSuite
	public void m4() {
		System.out.println("This is the m4 method of test2 class with @after suit annotation");
	}
	

}
