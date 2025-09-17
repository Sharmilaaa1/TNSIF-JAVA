package com.tnsif.inheriance;
class vehicle{
	void start() {
		System.out.println("The vehicle is starting");
	}
}
class car extends vehicle{
	void displayCar() {
		System.out.println("This is Car");
	}
}
class Bike extends vehicle{
	void displayBike() {
		System.out.println("This is Bike");
	}
}

public class Hierachial {
	public static void main(String[]args) {
		Bike b=new Bike();
		b.displayBike();
		car c=new car();
		c.displayCar();
		c.start();
	}

}
