package week6lab1;

import java.util.Scanner;

public class MyHr {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int choice=0;
		Employee[]emps= new Employee[5];
		Office[]offices= new Office[3];
		
		for(int y=0;y<=2;y++) {
			Office of = new Office();
			offices[y]=of;
			
		}
		while(choice!=4) {
			System.out.println("please select one of the following options");
			System.out.println("1. List all offices");
			System.out.println("2. Create new employe record");
			System.out.println("3. List all employees");
			System.out.println("4. Exit");
			choice = in.nextInt();
			
			if(choice==1) {
				for(Office of: offices) {
					System.out.println(of +"\t"+ "no of Employees: "+ of.getNoofEmps());
					if(of.getNoofEmps()!=0) {
						System.out.println("Employees "+ "\n"+ of.printEmployee());
					}
				}
			}
			else if(choice==2) {
				if(emps.length<=5) {
					String fname;
					String lname;
					String street;
					String city;
					String county;
					String empType;
					String comCarType=null;
					Scanner inEmp=new Scanner(System.in);
					System.out.println("Please enter employee first name");
					fname=inEmp.nextLine();
					System.out.println("Please enter employee last name");
					lname=inEmp.nextLine();
					System.out.println("Please enter employee's street name");
					street=inEmp.nextLine();
					System.out.println("Please enter employee's city name");
					city=inEmp.nextLine();
					System.out.println("Please enter employee's county name");
					county=inEmp.nextLine();
					System.out.println("Please enter employee type(Manager or Staff)");
					empType=inEmp.nextLine();
					if(empType.equalsIgnoreCase("Manager")) {
						System.out.println("Please enter company car type");
						comCarType=inEmp.nextLine();
					}
					Address add= new Address(street,city,county);
					Employee emp = new Employee(fname,lname,add,empType);
					emp.setComCarType(comCarType);
					emps[Employee.noOfEmployee()]=emp;
					for(Office of: offices) {
						if(of.getNoofEmps()<=2) {
							of.addEmployee(emp);
							break;
						}
					}
					
				}
				else {
					System.out.println("youve created max employes");
				}
			}
			else if(choice==3){
				for(Employee emp:emps) {
					if(emp!=null)System.out.println(emp);
				}
			}
			else if(choice==4){
				System.out.println("Goodbye");
				System.exit(0);
			}
			
			
		}
		
		
	}
	

}
