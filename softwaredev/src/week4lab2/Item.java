package week4lab2;

public class Item {
	
	//variables
	private int itemID;
	private static int nextItemID=0;
	private String name;
	private String type;
	private String manufactureDate;
	private char status;
	private double price;
	private static int noOfSales=0;
	
	//constructors
	public Item(String name, String type, String manufactureDate, double price,char status) {
		++ nextItemID;
		setItemID(nextItemID);
		setName(name);
		setType(type);
		setManufactureDate(manufactureDate);
		setPrice(price);
		setStatus(status);
		noOfSales++;
	}
	//getters and setters
	
	public int getItemID() {
		return itemID;
	}
	public void setItemID(int itemID) {
		this.itemID = itemID;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getManufactureDate() {
		return manufactureDate;
	}
	public void setManufactureDate(String manufactureDate) {
		this.manufactureDate = manufactureDate;
	}
	public char getStatus() {
		return status;
	}
	public void setStatus(char status) {
		this.status = status;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public static int getNoOfSales() {
		return noOfSales;
	}
	//misc methods
	public void statusUpdate() {
		setStatus('S');
	}
	//to string
	@Override
	public String toString() {
		if(status=='A') {
		return "Item [itemID=" + itemID + ", name=" + name + ", type=" + type + ", manufactureDate=" + manufactureDate
				+ ", status=" + status + ", price=" + price + "]";
	}
		else {
			return "Item [itemID=" + itemID + ", name=" + name + ", type=" + type + ", manufactureDate=" + manufactureDate
					+ ", status=" + status +"]";
		}
	}
}
