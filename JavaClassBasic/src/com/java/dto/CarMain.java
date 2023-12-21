package com.java.dto;

public class CarMain {

	public static void main(String[] args) {
		Car car = new Car();
		System.out.println("�������� : " + car.wheel);
		System.out.println();

		car = new FireEngine();
		if (car instanceof FireEngine) {
			
			FireEngine f = (FireEngine) car;
			System.out.println("Car �������� : " + car.wheel);
			System.out.println("FireEngine �������� : " + f.wheel);
			
			car.speedUp();
			f.speedUp();
			
			car.speedDown();
			f.speedDown();
			
		}
		else {
			System.out.println("it's not Ambulance instance");
		}

	}

}
