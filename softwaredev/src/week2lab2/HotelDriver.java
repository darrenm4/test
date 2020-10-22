package week2lab2;

public class HotelDriver {

	public static void main(String[] args) {
		
		HotelRoom roomA = new HotelRoom();
		
		roomA.setRoomNumber(200);
		roomA.setRoomType("single");
		
		HotelRoom roomB = new HotelRoom(201,"double");
		
		System.out.println("RoomNo.: " + roomA.getRoomNumber() + " RoomType " + roomA.getRoomType());
		
		System.out.println("RoomNo.: " + roomB.getRoomNumber() + " RoomType " + roomB.getRoomType());

	}

}
