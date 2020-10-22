package week2lab2;

public class HotelRoom {
	
	
	//Variables//
	private int roomNumber;
	private String roomType;
	private int vacant;
	private double rate;
	
	
  ///Constructors///
	public HotelRoom() {
		setRoomNumber(0);
		setRoomType("");
		setVacant(0);
		setRate(0);
	}

	public HotelRoom(int roomNumber, String roomType) {
		setRoomNumber (roomNumber);
		setRoomType (roomType);
	}


///Getters and Setters///	
	public int getRoomNumber() {
		return roomNumber;
	}
	public void setRoomNumber(int roomNumber) {
		this.roomNumber = roomNumber;
	}
	public String getRoomType() {
		return roomType;
	}
	public void setRoomType(String roomType) {
		this.roomType = roomType;
	}
	
   public int getVacant() {
		return vacant;
	}

	public void setVacant(int vacant) {
		this.vacant = vacant;
	}

	public double getRate() {
		return rate;
	}

	public void setRate(double rate) {
		this.rate = rate;
	}

	//ToString//	
	@Override
	public String toString() {
		return "HotelRoom [roomNumber=" + roomNumber + ", roomType=" + roomType + ", vacant=" + vacant + ", rate="
				+ rate + "]";
	}
	
	
}
