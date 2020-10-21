package week2lab1;


public class Thermtest
{ // begin class ThermTest
	public static void main(String args[]) 
	{ // being main method

		thermometer thermA = new thermometer();		// Create an instance of our Thermometer class

		System.out.println("Temp. of Thermometer A is " + thermA.getCelsius() );
		thermA.setCelsius(30.0);
		System.out.println("Temp. of Thermometer A is " + thermA.getCelsius() );
		
		thermometer thermB = new thermometer(10.0);
		
		double tempB = thermB.getCelsius();
		
		System.out.println("Temp. of Thermometer B is " + tempB);
		// get fahrenheit //
		tempB = thermB.getFahrenheit(); // should 50f if set to 10c //
		
		System.out.println("Temp. of the Thermometer B in fahrenheit is " + tempB);
		//set fahrenheit//
		
		thermB.setFahrenheit(100); //37.77 celsius
		
		tempB = thermB.getCelsius();
		System.out.println("Temp. of the Thermometer B is " + tempB);
				
	} // end main
} // end class ThermTest