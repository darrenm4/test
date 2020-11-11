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

	public static void setAnnualInterestRate(float annualInterestRate) {
		SavingsAccount.annualInterestRate = annualInterestRate;
	}

	public double getSavingsBalance() {
		return savingsBalance;
	}

	public void setSavingsBalance(double savingsBalance) {
		this.savingsBalance = savingsBalance;
	}

}
