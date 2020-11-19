package week5lab2;

public class Wheel {
	
	//variables
	private float radius;
	
	//constructors
	public Wheel(float radius) {
		setRadius(radius);
	}

	//getters and setters
	public float getRadius() {
		return radius;
	}

	public void setRadius(float radius) {
		this.radius = radius;
	}
	
	//to string
	@Override
	public String toString() {
		return "Wheel [radius=" + radius + "]";
	}
	
	//misc methods
	

}
