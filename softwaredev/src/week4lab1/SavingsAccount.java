package week4lab1;

public class SavingsAccount {
	
	//variables
	private int accNo;
	private static int nextAccno=0;
	private static float annualInterestRate=0.0f;
	private double savingsBalance;
	
	//constructors
	public SavingsAccount() {
		++nextAccno;
		setAccNo(nextAccno);		
	}
	
	public SavingsAccount(double savingsBalance) {
		++nextAccno;
		setAccNo(nextAccno);
		this.savingsBalance = savingsBalance;
	}

	//getters and setters
	public int getAccNo() {
		return accNo;
	}

	public void setAccNo(int accNo) {
		this.accNo = accNo;
	}

	public static float getAnnualInterestRate() {
		return annualInterestRate;
	}

	public static void modifyInterestRate(float annualInterestRate) {
		SavingsAccount.annualInterestRate = annualInterestRate;
	}

	public double getSavingsBalance() {
		return savingsBalance;
	}

	public void setSavingsBalance(double savingsBalance) {
		this.savingsBalance = savingsBalance;
	}
	
	//misc methods
	public void calculateMonthlyInterest() {
		savingsBalance+=((getSavingsBalance()*getAnnualInterestRate())/12);
	}
	
	//toString
	@Override
	public String toString() {
		return "SavingsAccount [accNo=" + accNo + ", savingsBalance=" + savingsBalance + "]";
	}

}//end main
