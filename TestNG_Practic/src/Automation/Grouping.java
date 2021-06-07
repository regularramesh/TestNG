package Automation;

import org.testng.annotations.Test;

public class Grouping {
	
	@Test(groups= {"samsung"})
	public void samsung1() {
		System.out.println("samsung");
	}
	@Test(groups= {"samsung"})
	public void samsung2() {
		System.out.println("samsung");
	}
	@Test(groups= {"nokia"})
	public void nokia1() {
		System.out.println("nokia");
	}
	@Test(groups= {"nokia"})
	public void nokia2() {
		System.out.println("nokia");
	}
	@Test(groups= {"sony"})
	public void sony1() {
		System.out.println("sony");
	}
	@Test(groups= {"sony"})
	public void sony2() {
		System.out.println("sony");
	}
	@Test(groups= {"onePlus"})
	public void onePlus1() {
		System.out.println("onePlus");
	}
	@Test(groups= {"onePlus"})
	public void onePlus2() {
		System.out.println("oneplus");
	}


}
