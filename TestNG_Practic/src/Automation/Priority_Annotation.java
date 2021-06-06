package Automation;

import org.testng.annotations.Test;

public class Priority_Annotation {
	
	//In this case the Result is running givien the Priority Order
	
		@Test(priority=1)
		public void driveCar() {
			System.out.println("Deive the car");
		}
		
		@Test(priority=2)
		public void runningCar() {
			System.out.println("The Car is Running");
		}
		
		@Test(priority=0)
		public void stratCar() {
			System.out.println("To Strat the Car");
		}
		
		@Test(priority=4)
		public void parkingCar() {
			System.out.println("Parking the Car");
		}
		
		@Test(priority=3)
		public void stopCar() {
			System.out.println("To Stop the Car");
		}
		


}
