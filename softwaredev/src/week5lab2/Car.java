package week5lab2;

import java.util.Arrays;

public class Car {
	
	//variables
	private String regNumber;
	private Wheel[]wheels= new Wheel[4];
	
	//constructors
	public Car(String regNumber) {
		setRegNumber(regNumber);
		for(int i=0;i<=wheels.length-1;i++) {
			Wheel wheel= new Wheel(i+1);
			wheels[i]=wheel;
		}
	}
	
	//getters and setters 
	public String getRegNumber() {
		return regNumber;
	}
	public void setRegNumber(String regNumber) {
		this.regNumber = regNumber;
	}
	
	//tostring
	@Override
	public String toString() {
		return "Car [regNumber=" + regNumber + ", wheels=" + Arrays.toString(wheels) + "]";
	}
	
	//misc methods

}
