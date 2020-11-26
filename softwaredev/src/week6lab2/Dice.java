package week6lab2;

import java.util.Random;

public class Dice {
	
	//variables
	private int faceValue;
	
	//constructors
	public Dice() {
	roll();
	}

	//getters and setters
	public int getFaceValue() {
		return faceValue;
	}

	public void setFaceValue(int faceValue) {
		this.faceValue = faceValue;
	}
	
	public void roll() {
		Random rand=new Random();
		faceValue=rand.nextInt((6-1)+1)+1;
	}
	
	//toString

}
