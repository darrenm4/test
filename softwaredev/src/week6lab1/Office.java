package week6lab1;

public class Office {
	
	//variables
	private static int nextOffice=100;
	private int officeNumber;
	private int noofEmps=0;
	private Employee[]employees=new Employee[2];
	
	
	//constructors 
	public Office() {
		setOfficeNumber(nextOffice);
		nextOffice++;
	}
	
	//getters and setters 

	public int getOfficeNumber() {
		return officeNumber;
	}
	public void setOfficeNumber(int officeNumber) {
		this.officeNumber = officeNumber;
	}
	public int getNoofEmps() {
		return noofEmps;
	}
	public void setNoofEmps(int noofEmps) {
		this.noofEmps = noofEmps;
	}
	public Employee[] getEmployees() {
		return employees;
	}
	public void setEmployees(Employee[] employees) {
		this.employees = employees;
	}
	
	//Misc method
	public void addEmployee(Employee employee) {
		if(noofEmps<=2) {
			employees[noofEmps]=employee;
			noofEmps++;
		}
		else
			System.out.println("youve reached nmmax employees");
	}
	
	public String printEmployee() {
		String empDetails="";
		for(Employee emp:employees) {
			if(emp !=null) {
				empDetails+=emp.getEmployeeNo()+ "," + emp.getFname()+","+emp.getLname()+"\n";		
			}
		}
		return empDetails;
	}
	
	//toString
		@Override
		public String toString() {
			return "Office [officeNumber=" + officeNumber + "]";
		}
		
}//end main
