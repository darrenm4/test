package week2lab2;

public class rectangleDriver {

	public static void main(String[] args) {
		
		rectangle rect = new rectangle();
		
		System.out.println(rect);
		
		rect.setLength(10.0f);
		rect.setWidth(20.0f);
		
		System.out.println(rect);
		
		rect.setLength(50.0f);
		rect.setWidth(-20.0f);
		
		System.out.println(rect);
		
		System.out.println("the area is " + rect.getArea());
		
		System.out.println("the perimeter is " + rect.getPerimeter());

	}

}
