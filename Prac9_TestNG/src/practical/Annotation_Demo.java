package practical;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.annotations.*;


public class Annotation_Demo {
	//@BeforeSuite() will be executed before starting of any of the test in the suite.
	@BeforeSuite
	public void beforeSuite() {
		System.out.println("This is before suite method");
	}
	
	//@AfterSuite() will be executed after all test in the suite are executed.
	@AfterSuite
	public void afterSuite() {
		System.out.println("This is after suite method");
	}
	
	@BeforeTest
	public void beforeTest() {
		System.out.println("This is before test method");
	}
	
	@AfterTest
	public void afterTest() {
		System.out.println("This is after test method");
	}
	
	@BeforeClass
	public void beforeClass() {
		System.out.println("This is before class method");
	}
	
	@AfterClass
	public void afterClass() {
		System.out.println("This is after class method");
	}
	
	@BeforeMethod
	public void beforeMethod() {
		System.out.println("This is before Method");
	}
	
	@AfterMethod
	public void afterMethod() {
		System.out.println("This is after Method");
	}
	
	@Test
	public void TestMethod_1() {
		System.out.println("This is First Test Method");
	}
	
	@Test
	public void TestMethod_2() {
		System.out.println("This is Second Test Method");
	}
	
	@Test
	public void TestMethod_3() {
		System.out.println("This is Third Test Method");
	}
	
}
