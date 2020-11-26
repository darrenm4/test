package week6lab2;

public class CarTest{
	
	public static void main(String args[]){
		
		Car car1 = new Car();
		
		car1.setWheels(4);
		car1.setPass(6);
		car1.setType("saloon");

		
		Car car2=new Car();
		
		car2.setWheels(4);
		car2.setPass(7);
		car2.setType("people carrier");
		
		Hgv h = new Hgv(3200,18,2);
		
		System.out.print(h);
		
		RoadVehicle[] rv = new RoadVehicle[3];
		
		rv[0]=car1;
		rv[0]=car2;
		rv[2]=h;
		
		for(RoadVehicle r: rv) System.out.println(r);
		}
}
