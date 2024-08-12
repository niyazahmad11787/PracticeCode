package WebPracticeDropdown;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Testing1 {

	@BeforeMethod

	public void m1() {
		
		
		System.out.println("This is the m1 method of test1 class with @before Method annotation");
		
	}
	
	@BeforeClass
	
    public void m2() {
		
		
		System.out.println("This is the m2 method of test1 class with @before class annotation");
		
	}
	
	@BeforeTest
    public void m3() {
		
		
		System.out.println("This is the m3 method of test1 class with @before Test annotation");
		
	}
	
	@Test
	public void main() {
		
		System.out.println("This is a main method of test 1 class");
	}
	
	@BeforeSuite
	public void m4() {
		System.out.println("This is the m4 method of test1 class with @before suit annotation");
	}
	
	
}
