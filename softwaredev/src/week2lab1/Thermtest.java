package week2lab1;


public class Thermtest
{ // begin class ThermTest
	public static void main(String args[]) 
	{ // being main method

		thermometer thermA = new thermometer();		// Create an instance of our Thermometer class

		System.out.println("Temp. of Thermometer A is " + thermA.getCelsius() );
		thermA.setCelsius(30.0);
		System.out.println("Temp. of Thermometer A is " + thermA.getCelsius() );
		
	} // end main
} // end class ThermTest