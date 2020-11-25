package week6lab1;

public class Employee {
	
	//variables
	private String fname;
	private String lname;
	private Address address;
	private static int nextstaffNo=100;
	private int employeeNo;
	private String empType;
	private String comCarType;
	
	//constructors

	public Employee(String fname, String lname, Address address, String empType) {
		setEmployeeNo(nextstaffNo);
		setFname(fname);
		setLname(lname);
		setAddress(address);
		setEmpType(empType);
		nextstaffNo++;
	}
	
	//getters and setters 
	
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	public int getEmployeeNo() {
		return employeeNo;
	}
	public void setEmployeeNo(int employeeNo) {
		this.employeeNo = employeeNo;
	}
	public String getEmpType() {
		return empType;
	}
	public void setEmpType(String empType) {
		this.empType = empType;
	}
	public String getComCarType() {
		return comCarType;
	}
	public void setComCarType(String comCarType) {
		this.comCarType = comCarType;
	}
	
	public static int noOfEmployee() {
		return nextstaffNo-1000;
	}
	
	
	//toString
	@Override
	public String toString() {
		if(empType.equalsIgnoreCase("Manager")) {
		return "Employee [fname=" + fname + ", lname=" + lname + ", address=" + address + ", employeeNo=" + employeeNo
				+ ", empType=" + empType + ", comCarType=" + comCarType + "]";
	}
		else {
			return "Employee [fname=" + fname + ", lname=" + lname + ", address=" + address + ", employeeNo=" + employeeNo
					+ ", empType=" + empType +"]";
		}
	}
}//end main
