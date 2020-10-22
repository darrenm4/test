package week2lab2;

public class HotelDriver {

	public static void main(String[] args) {
		
		HotelRoom roomA = new HotelRoom();
		
		roomA.setRoomNumber(200);
		roomA.setRoomType("single");
		
		HotelRoom roomB = new HotelRoom(201,"double");
		
		roomA.setVacant(1);
		roomA.setRate(100);
		
		roomB.setVacant(0);
		roomB.setRate(80);
		
		System.out.println("room " + roomA.toString());
		
		System.out.println("room " + roomB.toString());

	}

}
