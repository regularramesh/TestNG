package Automation;

import org.testng.annotations.Test;

public class Enable_Annotation {
	
	//In this case the Result Hide which one is give enabled=false
	//default enabled value =true
	
		@Test(enabled=false)
		public void driveCar() {
			System.out.println("Deive the car");
		}
		
		@Test()
		public void runningCar() {
			System.out.println("The Car is Running");
		}
		
		@Test
		public void stratCar() {
			System.out.println("To Strat the Car");
		}
		
		@Test
		public void parkingCar() {
			System.out.println("Parking the Car");
		}
		
		@Test
		public void stopCar() {
			System.out.println("To Stop the Car");
		}

}
