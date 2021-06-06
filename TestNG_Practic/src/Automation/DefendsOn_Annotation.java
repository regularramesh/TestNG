package Automation;

import org.testng.annotations.Test;

public class DefendsOn_Annotation {
	
	//In this case used to Run the Program Defeding on our methods
	
		@Test(dependsOnMethods = "startCar")
		public void driveCar() {
			System.out.println("Deive the car");
		}
		
		@Test(dependsOnMethods = "driveCar")
		public void runningCar() {
			System.out.println("The Car is Running");
		}
		
		@Test
		public void startCar() {
			System.out.println("To Strat the Car");
		}
		
		@Test(dependsOnMethods = "stopCar")
		public void parkingCar() {
			System.out.println("Parking the Car");
		}
		
		@Test(dependsOnMethods = "runningCar")
		public void stopCar() {
			System.out.println("To Stop the Car");
		}

}
