package Automation;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class BeforeAfter {
	@Test
	@AfterSuite
	void first() {
		System.out.println("First");
	}
	@Test
	@BeforeSuite
	void second() {
		System.out.println("Second");
	}
	@Test
	@Ignore
	void third() {
		System.out.println("Third");
	}
	
	@Test
	@AfterClass
		void forth() {
		System.out.println("Forth");
	}
	
	@Test
	@BeforeTest
	void fivth() {
		System.out.println("Fivth");
	}
	
	@Test
	@AfterTest
	void sixth() {
		System.out.println("Sixth");
	}
	
	@Test
	@AfterClass
	void seventh() {
		System.out.println("Seventh");
	}

}
