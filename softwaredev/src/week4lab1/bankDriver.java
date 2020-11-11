package week4lab1;

public class bankDriver {

	public static void main(String[] args) {
		
		SavingsAccount saver1 = new SavingsAccount();
		
		saver1.setSavingsBalance(2000.00);
		
		SavingsAccount saver2 = new SavingsAccount(3000.00);
		
SavingsAccount.modifyInterestRate(0.05f);
		
		saver1.calculateMonthlyInterest();
		saver2.calculateMonthlyInterest();
		
		System.out.println(saver1);
		System.out.println(saver2.toString());
		
		bankCustomer bc = new bankCustomer("Darren","Kildare");
		bc.addAccount(saver1);
		bc.addAccount(saver2);
		
		System.out.println(bc);
		System.out.println("savings total" + bc.balance(bc.getSavaccs()));
		
		
	}//end main

}
