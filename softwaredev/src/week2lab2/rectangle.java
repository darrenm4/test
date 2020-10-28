package week2lab2;

public class rectangle {
	
	//Variables//
	private float length;
	private float width;
	
	
	//Constructors//
	public rectangle() {
		setLength(1.0f);
		setWidth(1.0f);
	}
	
	//Getters & Setters//
	public float getLength() {
		return length;
	}
	
	public void setLength(float length) {
		if(length>0.0 && length<=40.0) {
			this.length = length;
		}
		else {
			System.out.println("length must be between 0.0 and 40.0");
		}
	}
	public float getWidth() {
		return width;
	}
	public void setWidth(float width) {
		if(width>0.0 && width <= 40.0) {
		this.width = width;
		}
		else {
			System.out.println("width must be between 0.0 and 40.0");
		}
	}
	//ToString//
	@Override
	public String toString() {
		return "rectangle [length=" + length + ", width=" + width + "]";
	}
	
	
	//Miscellaneous methods//
	public float getArea() {
		return length* width;
	}
	
	public float getPerimeter() {
		return (length + width)*2;
	}
	
	public void printRectangle() {
		String w = "*";
		
		for(int i=0;i<width-1;i++) {
			w+="*";
		}
		
		System.out.println(w);
		
		for(int j=0;j<length-2;j++) {
			System.out.println("*");
			for(int x=0;x<width-2;x++) {
				System.out.println(" ");
			}
			System.out.println("*");
		}
		System.out.println(w);
	}
}
