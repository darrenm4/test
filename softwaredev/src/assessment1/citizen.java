package assessment1;

public class citizen {
	
	//variables 
	private String firstName;
	private String secondName;
	private char gender;
	private int ppsNo;
	private char married;
	private String maidenName;
	private int records = 0; 
	
	//constructors
	public citizen(String firstName, String secondName, char gender, int ppsNo, char married, String maidenName,
			int records) {
		super();
		setFirstName(firstName);
		setSecondName(secondName);
		setGender(gender);
		setPpsNo(ppsNo);     //changed default constructors to match getters and setters 
		setMarried(married);
		setMaidenName(maidenName);
		setRecords(records);
	}
	
	
	//getters and setters
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getSecondName() {
		return secondName;
	}
	public void setSecondName(String secondName) {
		this.secondName = secondName;
	}
	public char getGender() {
		return gender;
	}
	public void setGender(char gender) {
		this.gender = gender;
	}
	public int getPpsNo() {
		return ppsNo;
	}
	public void setPpsNo(int ppsNo) {
		this.ppsNo = ppsNo;
	}
	public char getMarried() {
		return married;
	}
	public void setMarried(char married) {
		this.married = married;
	}
	public String getMaidenName() {
		return maidenName;
	}
	public void setMaidenName(String maidenName) {
		this.maidenName = maidenName;
	}

	public double getRecords() {
		return records;
	}
	public void setRecords(int records) {
		this.records = records;
	}
	
	
	//toString
	@Override
	public String toString() {
		return "citizen [firstName=" + firstName + ", secondName=" + secondName + ", gender=" + gender + ", ppsNo="
				+ ppsNo + ", married=" + married + ", maidenName=" + maidenName + ", records=" + records + "]";  		//needs to be implemented into driver program//
	}
	
	//miscMethods
	public void CitizenCount() {		//unsure of this method //
	// return (records);         
		
	}
	
	
	
}//end class
